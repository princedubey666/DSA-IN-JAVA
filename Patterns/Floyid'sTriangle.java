// Question: Write a Java program to print a number triangle pattern where numbers increase consecutively.
// The number of rows should be taken as input from the user.
// Example (for input 4):
//  1
//  2 3
//  4 5 6
//  7 8 9 10
// 11 12 13 14 15

import java.util.*; // Importing Scanner class for user input

public class FloyidsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner → To take input from the user

        System.out.println("Enter number of rows : "); // Prompt for number of rows
        int a = sc.nextInt(); // a → Stores the number of rows

        int num = 1; // num → Starting number to print

        // Outer loop → Controls the number of rows
        for (int i = 0; i <= a; i++) {

            // Inner loop → Prints increasing numbers in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + num); // Print the current number with leading space
                num++; // Increment to next number
            }

            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close Scanner → To release system resources
    }
}
