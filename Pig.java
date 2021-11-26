import java.util.Date;
import java.time.LocalDate;
public class Pig {

    private static int pigCount = 0;
    private LocalDate date;

    public static int getCount(){
        return pigCount;
    }

    public static void setCount(int PigCount) {
        Pig.pigCount = pigCount;
    }

    private String name;
    private String color;
    private char sex;
    private String PigID;
    private boolean Female;
    private boolean isFed;
    private Date DOB;

    public boolean isFemale(){
        return false;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex(){
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getDOB(){
        return DOB;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPigID() {
        return PigID;
    }

    public void setPigID(String pigID) {
        this.PigID = pigID;
    }
    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean isFed) {
        this.isFed = isFed;
    }


    Pig(String PigID_p,String Name_n, String Colour_c, char Sex_s) {
        PigID =PigID_p;
        name = Name_n;
        sex = Sex_s;
        color = Colour_c;
        LocalDate DOB  =LocalDate.now();

    }
    public void feed(Feed nofood){
        nofood.consume();
    }
}
