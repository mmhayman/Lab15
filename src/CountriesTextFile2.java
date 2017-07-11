import java.io.*;
import java.util.Scanner;


/**
 * Created by michelhayman on 7/11/17.
 */
public class CountriesTextFile2 {

    public static void readFromFile () {
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
            // if the test.txt file does not exist FileWriter will create it
            //FileWriter writer1 = new FileWriter("text.txt");  -- this takes in just a file
            FileWriter writer = new FileWriter("countries.txt", true);
            System.out.println("\n" + "Add a country: ");
            String userCountry = scan.nextLine();
            writer.write(userCountry + "\n");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



