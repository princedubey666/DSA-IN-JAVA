// Question: Write a Java program to print a reverse right-angled number triangle.
// Each row starts from 1 and prints decreasing numbers of elements in each next row.
// Example (for input 4):
//  1 2 3 4
//  1 2 3
//  1 2
//  1

import java.util.*; // Importing Scanner class for input

public class ReverseNumRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner → To take input from the user

        System.out.println("Enter number of rows : "); // Prompt for number of rows
        int a = sc.nextInt(); // a → Stores the number of rows

        // Outer loop → Controls the number of rows
        for (int i = 0; i <= a; i++) {

            // Inner loop → Prints numbers from 1 to (a - i)
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" " + j); // Print current number with space
            }

            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close Scanner → Release system resources
    }
}
