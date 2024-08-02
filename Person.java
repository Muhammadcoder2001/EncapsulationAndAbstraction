package OOP_encapsulation_abstraction_inheritance;

public class Person {

    public String name;
    public  String address;

    public Person(){
    this.name = "";
    this.address = "";

    }

    public void getName(){
         System.out.println("Name is " + this.name);

    }

    public void getAddress(){
        System.out.println("Address is " + this.address);

    }

    public void setName(String name){
            this.name = name;

    }

    public void setAddress(String address){
        this.address = address;

    }


//    public void ToString() {
//    }
}
