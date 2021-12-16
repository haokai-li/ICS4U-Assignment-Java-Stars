/*
* This program solves
* the Tower of Hanoi riddle.
*
* @author  Haokai
* @version 1
* @since   2020-12-16
*/

import java.util.Scanner;

/**
* This is the standard "Stars" program.
*/
final class Stars {
    /**
    * The star.
    */
    public static final String STAR = "*";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Stars() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Function finds the index of a number, using Binary Search recursively.
    *
    * @param nOfStars how many
    */
    static void calculate(final int nOfStars) {
        // This function show stars.
        int iLoop = 0;

        if (nOfStars < 1) {
            System.out.println("Input can not less than 1.");
        } else if (nOfStars == 1) {
            System.out.println(STAR);
            System.out.println(STAR);
        } else {
            for (iLoop = 0; iLoop < nOfStars; iLoop++) {
                System.out.print(STAR);
            }
            System.out.println("");
            calculate(nOfStars - 1);
            for (iLoop = 0; iLoop < nOfStars; iLoop++) {
                System.out.print(STAR);
            }
            System.out.println("");
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.print("\nHow many Stars do you want?: ");

        try {
            final int nOfStars = userInput.nextInt();
            System.out.println();
            calculate(nOfStars);
        } catch (java.util.InputMismatchException errorCode) {
            System.err.print("\nThis is not an integer");
        }
        System.out.println("\nDone.");
    }
}

