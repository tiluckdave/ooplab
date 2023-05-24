abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;

    public A(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    public double getPercentage() {
        double totalMarks = subject1Marks + subject2Marks + subject3Marks;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double subject4Marks;

    public B(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    public double getPercentage() {
        double totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        return (totalMarks / 400) * 100;
    }
}

public class CalculatePercentage {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 85);
        B studentB = new B(70, 75, 80, 85);

        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage());
    }
}
