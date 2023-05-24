import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 strings: ");
        String arr[] = new String[10];
        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            arr[i] = str;
        }

        Arrays.sort(arr);
        System.out.println("\nSorted Array: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\nCombination of 2 strings: ");
        String newstr = arr[0] + " " + arr[1];
        System.out.println(newstr);

        System.out.println("\nReverse of first element: ");
        StringBuilder strrev = new StringBuilder(arr[0]);
        strrev.reverse();
        System.out.println(strrev);
        sc.close();
    }
}
