// Question: Write a Java program to print a right-angled triangle number pattern.
// Each row should print numbers from 1 up to the current row number.
// Example (for input 4):
// 
// 1
// 1 2
// 1 2 3
// 1 2 3 4

import java.util.*; // Importing Scanner class for input

public class NumRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner → To take input from the user

        System.out.println("Enter number of rows : "); // Prompt for number of rows
        int a = sc.nextInt(); // a → Stores the number of rows

        // Outer loop → Controls the number of rows
        for (int i = 0; i <= a; i++) {

            // Inner loop → Prints numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j); // Print current number with leading space
            }

            System.out.println(); // Move to the next line after each row.
        }

        sc.close(); // Close Scanner → Release system resources.
    }
}
