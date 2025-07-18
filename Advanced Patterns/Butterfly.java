// Question: Write a Java program to print a butterfly pattern using stars (*).
// The pattern consists of two symmetrical halves (upper and lower), with spaces in between.
// Example (for input 4):
// *      *
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *

import java.util.*; // Importing Scanner class for input

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  Scanner →  To take input from the user

        System.out.print("Enter number of rows : ");  // Prompt for number of rows
        int a = sc.nextInt();   // a → Number of rows for each half of the butterfly

         // Upper half of the butterfly
        for (int i = 1; i <= a; i++) {

             // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

             // Calculate and print spaces in the middle
            int spaces = 2 * (a - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

             // Print right stars (same as left)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();  // Move to the next line
        }

         // Lower half of the butterfly
        for (int i = a; i >= 1; i--) {

             // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

             // Calculate and print spaces in the middle
            int spaces = 2 * (a - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

             // Print right stars (same as left)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();  // Move to the next line
        }

        sc.close();  // Close Scanner → Release system resources
    }
}
