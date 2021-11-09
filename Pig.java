import java.util.Date;
import java.time.LocalDate;
public class Pig {

    private static int pigcount = 0;

    public static int getCount(){
        return pigcount;
    }

    private String name;
    private String colour;
    private String sex;
    private boolean Female;
    private Date DOB;

    public boolean isFemale(){
        return false;
    }
    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }

    public String getSex(){
        return sex;
    }

    public Date getDOB(){
        return DOB;
    }

    Pig(String Name_n, String Colour_c, String Sex_s) {
        name = Name_n;
        sex = Sex_s;
        colour = Colour_c;
        LocalDate DOB  =LocalDate.now();

    }
    public void feed(Feed nofood){
        nofood.Consume();
    }
}