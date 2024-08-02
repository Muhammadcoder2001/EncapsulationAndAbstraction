package OOP_encapsulation_abstraction_inheritance;

public class Student extends Person{

    private String programm;
    private int year;
    private double fee;


    public Student(){
        this.programm = "Python Programming language";
        this.year = 2019;
        this.fee = 1258.50;
        super.address = "Olmos Shahri";
        super.name = "Abdulbosit";

    }

    public String getProgramm(){
        return ("Programm is " + this.programm);

    }

    public int getYear(){
        return (this.year);

    }

    public double getFee(){
        return (this.fee);

    }

    @Override
    public void getAddress() {
        System.out.println(super.address);

    }

    @Override
    public void getName(){
        System.out.println(super.name);

    }

    public void setProgramm(String programm){
        this.programm = programm;

    }

    public void setYear(int year){
    this.year = year;

    }

    public void setFee(double fee){
        this.fee = fee;

    }

    public void ToString (){

        System.out.println("Name is " + super.name + "\n"
        + "Address is " + super.address + "\n"
        + "Programm is " + this.programm + "\n"
        + "Year is " + this.year + "\n" +
        "Fee is " + this.fee);

    }


}
