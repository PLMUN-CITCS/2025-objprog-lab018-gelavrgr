// File Name: EvenOddChecker.java

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        // Get an integer input from the user
        int number = getIntegerInput();
        
        // Check if the number is even or odd and get the result message
        String resultMessage = checkEvenOrOdd(number);
        
        // Display the result message to the user
        System.out.println(resultMessage);
    }

    /**
     * This method prompts the user to enter an integer and returns the input.
     * @return the integer input from the user
     */
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        // Loop until a valid integer is entered
        while (!validInput) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true; // Valid input received
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return number;
    }

    /**
     * This method checks if the given number is even or odd.
     * @param number the integer to check
     * @return a string message indicating if the number is even or odd
     */
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
