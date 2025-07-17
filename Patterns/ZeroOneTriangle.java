// Question: Write a Java program to print a triangle pattern of alternating 1s and 0s.
// The rule is: print 1 if (row + column) is even, otherwise print 0.
// Example (for input 4):
// 
// 
// 1
// 0 1
// 1 0 1
// 0 1 0 1

import java.util.*; // Importing Scanner class for user input

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner → To take input from the user

        System.out.print("Enter number of rows : "); //Prompt for number of rows
        int a = sc.nextInt(); // a → Stores the number of rows

         // Outer loop → Controls the number of rows
        for (int i = 0; i <= a; i++) {

             // Inner loop →  Controls the number of columns in each row
            for (int j = 1; j <= i; j++) {
                int k = j + i; // k → Sum of row and column index.

                 // Check if k is even or odd and print accordingly.
                if (k % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();   // Move to the next line after each row.
        }

        sc.close(); // Close Scanner → Release system resources
    }
}
