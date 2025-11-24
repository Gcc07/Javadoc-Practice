/**
 * Gabriel Cardenas
 * Course: Java I
 * Date: 11/24/2025
 *
 * A program used to demonstrate javadoc usage and creation.
 */
public class JavadocPractice {

    // ------------------------------------------------------------
    // This class is used for a variety of calculative methods, as well as performing basic print calls.
    // ------------------------------------------------------------

    
    /**
     * This is the main method used for runtime calls for methods within the class, and print statements.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        printWelcome();
        int result = add(4, 9);
        System.out.println("4 + 9 = " + result);
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 3 and 7 is " + max(3, 7));
    }


    /**
     * A method that returns an added number (integer) based off of a two-int parameter input system.
     * @param a the first int number you are adding
     * @param b the second int number you are adding
     * @return the added number of the two int arguments returned as an int
     */
    public static int add(int a, int b) {
        return a + b;
    }


    /**
     * A method that returns either true or false depending on whether the input is odd or even.
     * @param value an integer value that you are checking
     * @return returns true if argument is even
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    /**
     * Prints a welcome statement
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Javadoc practice file.");
    }


    /**
     * Returns the largest value of two numbers
     * @param x the first integer number you are comparing
     * @param y the second integer number you are comparing
     * @return returns the larger of the two arguments as an integer.
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
