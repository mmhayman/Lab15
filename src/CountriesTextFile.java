import java.io.*;
import java.util.Scanner;


/**
 * Created by michelhayman on 7/11/17.
 */
public class CountriesTextFile {

    public static void readFromFile() {
        // read from file
        try {
            File myFile = new File("countries.txt");

            FileReader reader = new FileReader(myFile);

            BufferedReader buff = new BufferedReader(reader);

            String line = null;

            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }

            buff.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() {
        // write to file
        try {

            Scanner scan = new Scanner(System.in);
            FileWriter writer = new FileWriter("countries.txt", true);
            System.out.print("Add a country: " + "\n");
            String userCountry = scan.nextLine();

            if (!Validation.checkForDuplicateCountry((userCountry))) {
                writer.write(userCountry + "\n");
                System.out.println("Country has been saved!");
                writer.close();

            } else {
                System.out.println();
                System.out.println("Country is already in the list.");
                System.out.println();

            }
            // put validation


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


