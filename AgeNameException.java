class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        this.age = age;

        if (!isChar(name)) {
            throw new NameNotValidException("Name is not valid. It should only contain alphabets and spaces.");
        }
        this.name = name;

        this.course = course;
    }

    public static boolean isChar(String str) {
        // iterate over the string check if the string contains only alphabets and spaces
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') &&
                !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') &&
                !(str.charAt(i) == ' ')) {
                return false;
            }
        }
        return true;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class AgeNameException {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            System.out.println("Student 1:");
            System.out.println("Roll No: " + student1.getRollNo());
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Course: " + student1.getCourse());
            System.out.println();

            Student student2 = new Student(2, "Jane Smith", 14, "Electrical Engineering");
            System.out.println("Student 2:");
            System.out.println("Roll No: " + student2.getRollNo());
            System.out.println("Name: " + student2.getName());
            System.out.println("Age: " + student2.getAge());
            System.out.println("Course: " + student2.getCourse());
            System.out.println();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
