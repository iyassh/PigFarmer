import java.text.NumberFormat;
public class PigCollection
    {
        private int size;
        private int arraySize = 5;
        private Pig[] pigArray;

        public PigCollection() {
            this.pigArray = new Pig[arraySize];
        }
        public Pig[] getPigArray() {
            return pigArray;
        }

        public void setPigArray(Pig[] pigArray) {
            this.pigArray = pigArray;
        }
        private void expandSize() {
            int temp = arraySize  * 2;
            Pig[] newArray = new Pig[temp];

            for (int i = 0; i < arraySize; i++) {
                newArray[i] = pigArray[i];
            }
            arraySize =temp;
            pigArray = newArray;
        }

        public void addPig(Pig pig) {
            if (size >= arraySize) {
                expandSize();
            }
            pigArray[size] = pig;
            size++;
        }
        public int getPigCount() {
            return size;
        }
        public boolean isEmpty() {
            return size == 0;
        }

        public String getPigList() {
            String string = "";

            for(int i = 0; i < size; i++) {
                string += pigArray[i].getName() + ", ";
            }
            if (!string.equals("")) {
                string = "[" + string.substring(0, string.length() -2) + "}";
            }else {
                string = "[]";
            }
            return string;
        }
    }









