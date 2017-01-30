

/**
 * Created by davidshinabarger on 1/30/17.
 */

import java.util.Scanner;

/**
 * Prompt user for length & width of classroom
 * Display length & width
 * display area & perimeter
 * ask if user wants to continue -- if not, keep calculating more rooms
 */

public class AreaandPerimeter {
    public static void main(String[] args) {
        char answer1 = ' ';

        while (answer1 != 'N') {
            System.out.println("Please enter length in feet:");
            Scanner scan1 = new Scanner(System.in);
            double length = 0.0;
            length = scan1.nextDouble();
            scan1.nextLine();

            System.out.println("Please enter width in feet: ");
            double width = scan1.nextDouble();
            scan1.nextLine();

            System.out.println("Please enter height in feet: ");
            double height = scan1.nextDouble();
            scan1.nextLine();

            System.out.println("Area is: " + (length * width) + " square feet.");
            System.out.println("Perimeter is: " + ((length * 2) + (width * 2)) + " feet long.");
            System.out.println("Volume is: " + (length * width * height) + " cubic feet.");

            System.out.println("Would you like to continue? (YAY/NAY): ");
            String answer = scan1.nextLine();
            answer1 = answer.charAt(0);
            System.out.println(answer1);

        }
        System.out.println("Thanks.");

    }
}



