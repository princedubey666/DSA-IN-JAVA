// Question: Write a Java program to print a right-angled triangle pattern using stars (*).
// The number of rows should be taken as input from the user.
// Example:
// Enter number of rows: 4
// Output:
// *
// **
// ***
// ****

import java.util.*; // Importing Scanner class for taking input

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  Scanner  → To take input from the user.

        System.out.println("Enter number of rows : "); // Prompt message for user input.
        int a = sc.nextInt(); // a → Stores the number of rows to print.

       // Outer loop → Controls the number of rows.
        for (int i = 0; i <= a; i++) {

            // Inner loop → Prints '*' symbols equal to the current row number.
            for (int j = 0; j < i; j++) {
                System.out.print("*"); //  Print a star in the current position
            }

            System.out.println();   // Move to the next line after each row is printed.
        }

        sc.close(); // Close the Scanner object to free system resources.
    }
}
