// Question: Write a Java program to print a left-aligned increasing triangle pattern using stars (*)
// The pattern should be aligned using spaces before the stars.
// Example (for input 4):
//     
//     *
//    **
//   ***
//  ****
// *****

import java.util.*; // Importing Scanner class for input

public class InvertedRightAngle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  Scanner → To take input from the user

        System.out.println("Enter number of rows : "); // Prompt for number of rows
        int a = sc.nextInt(); // a → Number of rows.

        // Outer loop→ Controls the number of rows (from a to 0 for top-down alignment)
        for (int i = a; i >= 0; i--) {

            // First inner loop →Prints spaces for alignment
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            //Second inner loop → Prints stars in increasing order
            for (int j = 0; j < a - i; j++) {
                System.out.print("*");
            }

            System.out.println(); //  Move to the next line after printing one row
        }

        sc.close(); //   Close Scanner → To release system resources !  
    }
}
