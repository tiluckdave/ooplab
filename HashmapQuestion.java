// You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person. Use HashMap to implement it.The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
// After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
// Constraints:
// A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number.

import java.util.HashMap;
import java.util.Scanner;

public class HashmapQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();

        // Accept data for 5 persons
        System.out.println("Enter the number of entries in the phone book");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone Number: ");
            int phoneNumber = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Accept queries
        System.out.println("Enter the number of queries");
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the name of the person to search");
            String name = scanner.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + ": " + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}


