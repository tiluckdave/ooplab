//A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
// A
// class named
// Adder that
// inherits from
// a superclass
// named Arithmetic.
// The main
// method in
// the Tester

// class should
// print the following:
// SAMPLE O/P:
// My superclass is:Arithmetic 42 13 20

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class ClassSuperclass {
    public static void main(String[] args) {
        Adder adder = new Adder();

        // Print superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        // Perform addition using the add() method
        int sum = adder.add(42, 13);
        System.out.println("42 + 13 = " + sum);

        // Perform addition using the add() method from the superclass
        int sum2 = adder.add(20, 0);
        System.out.println("20 + 0 = " + sum2);
    }
}
