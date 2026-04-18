package Introduction;

class BankAccount{

    //attributes
    private String name;
    private double balance;

    //constructor
    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    //methods - getters and setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class AttributesAndMethods {
    public static void main(String[] args) {

        //customer

        BankAccount cust1 = new BankAccount("Rahul", 50000); //constructor called
        System.out.println("Name: " + cust1.getName());
    }
}