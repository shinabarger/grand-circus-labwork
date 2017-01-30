import java.util.Scanner;

/**
 * Created by davidshinabarger on 1/30/17.
 * GOAL: Convert number grades into letter grades
 * Display the corresponding letter grade
 * prompt the user to continue, only continue if they say "y" or "Y"
 * Edit grade ranges to include pluses & minuses
 */
public class GradeConverter {
    public static void main(String[] args) {

        char answer1 = 'y';

        while (answer1 == 'Y' || answer1 == 'y') {
            System.out.println("This is a grade converter");
            System.out.println("Enter a numerical grade from 0-100: ");
            Scanner scan = new Scanner(System.in);
            int grade = scan.nextInt();
            scan.nextLine();

            if (grade >= 88) {
                System.out.println("You got an A as in AMAZING!");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("You got a B as in BOMBER!");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("You got a C as in CHARISMATIC!");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("You got a D as in DIN-O-SOAR");
            } else if (grade <= 60) {
                System.out.println("You got an F for FAILURE.");
            }

            //ask user if they want to continue
            System.out.println("Would you like to continue? Yes/No ");
            String answer = scan.nextLine();
            answer1 = answer.charAt(0);


        }

    }
}
