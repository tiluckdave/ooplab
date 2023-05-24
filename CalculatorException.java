//You are required to compute the power of a number by implementing a calculator. Create a class My Calculator which consists of a single method long power (int, int). This method takes two integers n and p, as parameters and finds (n)p. If either or is negative, then the method must throw an exception which says " n or p should not be negative”. Also, if both and are zero, then the method must throw an exception which says "n or p should not be negative”.

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class CalculatorException {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        try {
            long result1 = calculator.power(2, 3);
            System.out.println("Result 1: " + result1); // 2^3 = 8

            long result2 = calculator.power(0, 0);
            System.out.println("Result 2: " + result2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
