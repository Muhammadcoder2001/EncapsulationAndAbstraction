package OOP_encapsulation_abstraction_inheritance;

public class Result {
    public static void main(String[] args) {
        Student student = new Student();
        Staff staff = new Staff();

        student.getAddress();
        student.getName();
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        System.out.println(student.getProgramm());


        student.setName("Baxodirxon");
        student.setAddress("Namangan shahri");
        student.setProgramm("Java");
        student.setYear(2019);
        System.out.println();
        student.ToString();

        System.out.println();

        staff.getPay();
        staff.getSchool();
        staff.getName();
        staff.getAddress();

        System.out.println();

        staff.setPay(1243.54);
        staff.setSchool("64- Maktab");

        System.out.println();
        staff.turnString();

    }
}
