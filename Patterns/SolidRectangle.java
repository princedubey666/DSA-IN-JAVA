// Question: Write a Java program to print a rectangle pattern of stars based on user-defined number of rows
// Example:
// *****
// *****
// *****
// ***** 

import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To take input from the user

        // Ask the user how many rows to print
        System.out.println("Enter number of rows: ");
        int a = sc.nextInt();  // a = number of rows

        System.out.println("Enter number of columns: ");
        int b = sc.nextInt(); // b = number of columns

        //  To print each row (one line of stars per iteration)
        for (int i = 0; i <= a; i++) {

            // Inner loop ->To print all stars in one row
            for (int j = 0; j <= b; j++) {
                System.out.print("*");
            }

            //  To move to the next line after printing one row
            System.out.println();
        }

        sc.close(); // Close Scanner -> To release system resources
    }
}
