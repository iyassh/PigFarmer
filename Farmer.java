import java.util.Scanner;
import java.time.LocalDate;

public class Farmer {

    static Scanner input = new Scanner(System.in);
    static String pigId, pigName, sex, pigColor, feedType, pigList;
    static int year, month, day, numBin;
    static double weight;
    static PigCollection pigCollection = new PigCollection();
    static FeedCollection feedCollection = new FeedCollection();

    public static void main(String[] args) {


        int choice;

        do {
            Menu();
            do {
                while (!input.hasNextInt()) {
                    System.out.println("Wrong Input");
                    System.out.print("Action: ");
                    input.nextLine();
                }
                choice = input.nextInt();
                if (choice < 0 || choice > 5) {
                    do {
                        System.out.println("Action not found. Try again...");
                        System.out.print("Enter you choice again: ");
                        choice = input.nextInt();
                    } while (choice < 0 || choice > 5);
                }
            } while (choice < 0);

            switch (choice) {
                case 1:

                    getPigInfo();
                    Pig newPig = new Pig(pigId, pigName, sex.charAt(0), pigColor, LocalDate.of(year, month, day));
                    pigCollection.addPig(newPig);
                    System.out.println("Pig has been added!");
                    System.out.println("ID: " + newPig.getPigID() + "\nName: " + newPig.getName() + "\nColor: " + newPig.getColour()+ "\nSex: "
                            + newPig.getSex()  + "\nDate of Birth: " + newPig.getDOB());
                    break;
                    case 2:

                    getFeedInfo();
                    Feed newFeed = new Feed(feedType);
                    feedCollection.setFeedNumber(numBin, newFeed);
                    System.out.println("Feed has been added at " + numBin);
                    break;
                    case 3:

                    if (pigCollection.isEmpty()) {
                        System.out.println("Sorry, there are no pigs! ");
                    } else {
                        for (int i = 0; i < pigCollection.getPigCount(); i++) {
                            Feed tempFeed = feedCollection.getNextFullBin();
                            System.out.println(feedCollection.getNumberOfFullBins() + " bin(s) available.");
                            if (tempFeed != null) {
                                pigCollection.getPigArray()[i].feed(tempFeed);
                                System.out.println("Bin used");
                            } else {
                                System.out.println("No more bins are left!.");
                                break;
                            }
                        }
                    }
                    break;
                    case 4:

                    System.out.println("There are " + feedCollection.getSize() + " bins available");
                    pigList = pigCollection.getPigList();
                    System.out.println("Pigs: " + pigList);
                    break;
                    case 5:

                    System.out.println("You decided to exit;Thank You");
                    break;
            }

            System.out.println();

        } while (choice != 5);

    }

    public static void Menu() {
        System.out.println("Choose what action you want to perform:");
        System.out.println("1. Add Pig\n2. Add Feed\n3. Feed Pigs\n4. Report\n5. Exit");
        System.out.print("What is your choice: ");

    }
    public static void getFeedInfo() {
        System.out.println("Number of bin: ");
        numBin = input.nextInt();
        System.out.println("Feed type: ");
        feedType = input.next();
        System.out.println("Weight (in kg): ");
        weight = input.nextDouble();
    }


    public static void getPigInfo() {
        System.out.println(" Enter Pig ID: ");
        pigId = input.next();
        System.out.println(" Enter Name: ");
        pigName = input.next();
        System.out.println(" Enter Sex: ");
        sex = input.next();
        System.out.println("Enter Color: ");
        pigColor = input.next();
        System.out.println(" Enter Year of birth (YYYY): ");
        year = input.nextInt();
        System.out.println(" Enter Month of birth (MM): ");
        month = input.nextInt();
        System.out.println(" Enter Day of birth (DD): ");
        day = input.nextInt();
    }


    

}
