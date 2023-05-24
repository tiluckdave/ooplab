//Write a Java program to display the pattern like a diamond.
// Input number of rows (half of the diamond) :7 Expected Output :
// * 
// *** 
// ***** 
// ******* 
// ********* 
// *********** 
// ************* 
// *********** 
// ********* 
// ******* 
// ***** 
// *** 
// *
// skip the even star rows

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int i, j, k;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 1; i--) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }

}