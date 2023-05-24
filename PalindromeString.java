public class PalindromeString {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("aba");
        StringBuilder strrev = str.reverse();
        if (str.equals(strrev)) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
