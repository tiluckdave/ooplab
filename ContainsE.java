//How to Check if the String Contains 'e' in umbrella

public class ContainsE {
    public static void main(String[] args) {
        String str = "umbrella";

        // Check if the string contains 'e'
        boolean containsE = str.contains("e");

        if (containsE) {
            System.out.println("The string contains 'e'.");
        } else {
            System.out.println("The string does not contain 'e'.");
        }
    }
}
