package OOP_encapsulation_abstraction_inheritance;

public class Staff  extends Person{

    private String school ;
    private  double pay;

    public Staff(){
        this.school = "56-maktab";
        this.pay = 12334.7;
        super.address = "Chust tumani";
        super.name = "Abdulboriy";

    }

    public void getSchool(){
        System.out.println("School is " + this.school);

    }

    public void getPay(){
        System.out.println("Pay is " + this.pay);

    }

    public void setSchool(String school){
        this.school = school;

    }

    public void setPay(double pay){
        this.pay = pay;

    }

}
