package week9_homework;


import java.util.Locale;
import java.util.Scanner;


public class Programme_10 {


    public static void main(String[] args) {

        String station_Name;
        boolean b = false;
        char answer = 'Y';

        // creating sting array to store zone 1 tube station names to check with the entered
        String[]zon1_Stations = {"ALDGATE", "EUSTON SQUARE", "OXFORD CIRCUS", "WATERLOO LU", "TOWER HILL", "OLD STREET", "SOUTH KENSINGTON",
                " VICTORIA", "LANCASTER GATE", "GREEN PARK", "FARRINGDON", "EDGWARE ROAD", "QUEENSWAY",
                "KINGS CROSS ST PANCRAS ", "VAUXHALL LU", "EUSTON", "BAYSWATER", "ANGEL", "PADDINGTON",
                "BAKERSTREET", " KNIGHTBRIDGE", "CHARING CROSS LU", "GLOUCESTER ROAD", "REGENTS PARK", "HYDE PARK CORNER",
                "LEICESTER SQUARE", "LONDON BRIDGE", "PICCADILLY CIRCUS", "MOORGATE", "ST PAUL'S", "WESTMINSTER", "HOLBORN,",
                "COVENT GARDEN", "BOND STREET", "MARBLE ARCH", "TOTTENHAM COURT ROAD", "RUSSELL SQUARE"};
        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter station name to find out is it in Zone -1 or not : ");
            station_Name = scan.nextLine();// storing the station name entered by user
            station_Name = station_Name.toUpperCase(); // changing entered tube station name to upper case
            System.out.println(station_Name);
            for (int i = 0; i < zon1_Stations.length; i++) {

                // System.out.println(station_Name.equals(zon1_Stations[i]));


                b = station_Name.equals(zon1_Stations[i]);// storing true/false result in b by checking station name entered is equal to i place
                                        // array value

                if (b) { // if it is true that means it found the match and then exit the loop with break statement
                    break;
                }
            }

                if (b) { // it will print below message if it is true

                    System.out.println("Entered Station is in zone 1");
                    //System.out.println(j);

                } else {
                    System.out.println("Entered station is NOT in zone 1 ");
                }

                System.out.println("Would you like to enter another station name -enter Y / N :");
                answer = scan.next().charAt(0);
 // if user entered y then it will ask the user to enter the another tube station name
        }while (answer == 'Y' || answer == 'y') ;
        System.exit(0);
    }
}
