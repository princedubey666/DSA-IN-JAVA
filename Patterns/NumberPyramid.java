// Question: Write a Java program to print the following number pattern:
//      1
//     2 3
//    4 5 6
//   7 8 9 10

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 4; // How many rows do we want in the pattern?
        int num = 1;  // What is the starting number to print?
//  To iterate through each row from 1 to 'rows'.
        for (int i = 1; i <= rows; i++) {
 // To print spaces before the numbers in each row to make the pattern triangle-shaped.
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++; // Increase the number for the next position.
            }

           
            System.out.println(); // To move to the next line after each row is printed.
        }
    }
}
