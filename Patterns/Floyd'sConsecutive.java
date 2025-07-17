// Question: Write a Java program to print Floyd's Triangle using consecutive numbers.
// Each row prints increasing numbers in triangle form.
// Example (for input 4):
//  1
//  2 3
//  4 5 6
//  7 8 9 10

import java.util.*; // Importing Scanner class for user input

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner → To take input from the user

        System.out.print("Enter number of rows : ");   // Prompt message for user
        int a = sc.nextInt(); // a → Stores number of rows

        int num = 1; // num → Initializing a number to be printed

        // Outer loop → Controls the number of rows
        for (int i = 0; i <= a; i++) {

            // Inner loop → Prints numbers in each row from 'num' onwards.
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + num); // Print the current number with leading space
                num++; // Increment to the next number
            }

            System.out.println();  // Move to the next line after each row.
        }

        sc.close(); // Close Scanner →Release system resources
    }
}
