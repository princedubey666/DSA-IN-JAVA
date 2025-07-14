// Question: Write a Java program to print a reverse right-angled triangle pattern using stars (*).
// The number of rows should be taken as input from the user.
// Example (for input 4):
// *****
// ****
// ***
// **
// *

import java.util.*; 
public class ReverseRightAngle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner → To take input from the user

        System.out.println("Enter number of rows : "); // Prompt for number of rows
        int a = sc.nextInt(); // a → Stores the number of rows

        // Outer loop → Controls the number of rows (starts from a and goes down to 0)
        for (int i = a; i >= 0; i--) {

            // Inner loop → Prints stars in decreasing order
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); // Print a star
            }

            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close Scanner →To release system resources
    }
}
