//Program to remove all repeated elements from an array
import java.util.*;

public class Remove_Duplicates {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 15, 40, 15, 40));
        System.out.println("ArrayList with duplicates: " + list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}