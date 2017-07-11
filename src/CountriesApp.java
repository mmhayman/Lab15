import java.util.Scanner;

/**
 * Created by michelhayman on 7/11/17.
 */
public class CountriesApp {

    public static void main(String[] args) {

        boolean userContinue = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Countries Maintenance Application");
        System.out.println();

        do {
            System.out.println(" 1- See the list of countries");
            System.out.println(" 2- Add a country");
            System.out.println(" 3 - Exit");
            System.out.println();


            System.out.print("Enter menu number: ");
            int menuNum = scan.nextInt();
            menuNum = Validation.menuNumValidation(menuNum);

            switch (menuNum) {
                case 1:
                    CountriesTextFile.readFromFile();
                    System.out.println();
                    break;


                case 2:
                    CountriesTextFile.writeToFile();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Goodbye!");
                    userContinue= false;
                    break;

            }

        }while (userContinue);
    }
}
