package OOP_encapsulation_abstraction_inheritance;

public class Result {
    public static void main(String[] args) {
        Person student = new Student();
        Person staff = new Staff();

        student.getAddress();
        student.getName();
    }
}
