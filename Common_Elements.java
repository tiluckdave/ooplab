//Write a Java program to find the common elements between two arrays of integers.
import java.util.*;

public class Common_Elements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        List<Integer> commonElements = new ArrayList<>();

        for (int num : array1) {
            if (Arrays.binarySearch(array2, num) >= 0) {
                commonElements.add(num);
            }
        }

        System.out.println("Common Elements: " + commonElements);
    }
}
