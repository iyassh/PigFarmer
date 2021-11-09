import java.util.Scanner;
import java.time.LocalDate;
public class Farmer {
    public static void main(String[] args){
        int applefeed = 0;
        int potatofeed = 0;

        String vrfy = "Y";
        String feedpig;


        Pig pig1 = new Pig("Toby","pink", "Male");
        Pig pig2 = new Pig("Matt","Brown", "Male");
        Pig pig3 = new Pig("Doris","Black", "Male");



        Scanner sc = new Scanner(System.in);

        while (vrfy.equals("Y")){

            System.out.println(" How many new bins of potato do you have?");
            potatofeed = sc.nextInt();
            Feed feed =new Feed("Potato",potatofeed);

            System.out.println("How many new bins of apple do you have?");
            applefeed =sc.nextInt();
            Feed feed1 = new Feed("Apple",applefeed);

            System.out.println("Do you want to feed the pigs?(Y/N)");
            feedpig = sc.next();
            if (feedpig.equals("Y")){
                Feed.Consume();


            }
            else{
                System.out.println("You have decided not to feed the pigs.");
            }

            System.out.println("Do you wish to rerun this segment? ");
            vrfy =sc.next();

        }
    }
}
