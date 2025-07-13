// Question: Write a Java program to print the following number pattern:
//      1
//     2 3
//    4 5 6
//   7 8 9 10

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4; // How many rows do we want in the pattern?
        int num = 1;  // What is the starting number to print?

        // Why are we using this loop? -> To iterate through each row from 1 to 'rows'
        for (int i = 1; i <= rows; i++) {

            // Why this loop? -> To print spaces before the numbers in each row to make the pattern triangle-shaped
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Why this loop? -> To print the numbers in each row
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++; // Increase the number for the next position
            }

            // Why this line? -> To move to the next line after each row is printed
            System.out.println();
        }
    }
}
