// Question: Write a Java program to print a solid rhombus pattern of stars (*).
// Each row is right-shifted using spaces, but the number of stars in every row is constant.
// Example (for input 5):
//     *****
//    *****
//   *****
//  *****
// *****

import java.util.*; //  Import Scanner class for input

public class Rhombus  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //   Scanner  → To take user input

        System.out.print("Enter number of rows (or stars per row): ");
        int n = sc.nextInt();    // n  → Number of rows and number of stars in each row

         // Outer loop → Controls number of rows
        for (int i = 1; i <= n; i++) {

             // Inner loop 1 → Prints (n - i) spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

             // Inner loop 2 → Prints 'n' stars in each row.
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();   //  Move to the next line after each row
        }

        sc.close();   // Close Scanner → Release system resources
    }
}
