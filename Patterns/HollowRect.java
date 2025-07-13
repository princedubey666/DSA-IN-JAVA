// Question: Write a Java program to print a hollow rectangle pattern using stars (*).
// The user should input the number of rows and columns.
// Example:
// Enter number of rows: 4
// Enter number of columns: 6
// Output:
// *******
// *     *
// *     *
// *     *
// *******

import java.util.*;

public class HollowRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner → To take input from the user.

        System.out.println("Enter number of rows : "); // Prompt for number of rows.
        int a = sc.nextInt(); // a → Stores the number of rows.

        System.out.println("Enter number of columns : "); // Prompt for number of columns.
        int b = sc.nextInt(); // b → Stores the number of columns.

        // Outer loop → Controls the number of rows.
        for (int i = 0; i <= a; i++) {

            // Inner loop → Controls the number of columns per row.
            for (int j = 0; j <= b; j++) {

                // Checks if current position is on the border.
                if (i == 0 || j == 0 || i == a || j == b) {
                    System.out.print("*"); // Print star on the border.
                } else {
                    System.out.print(" "); // Print space inside the rectangle.
                }
            }

            System.out.println(); // Newline → Moves to the next row.
        }

        sc.close(); // Close Scanner → To release system resources.
    }
}
