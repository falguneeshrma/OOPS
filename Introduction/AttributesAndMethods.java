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
    public double getBalance(){
        return balance;
    }
    public double addMoney(double amount){
        try{
            this.balance += amount;
        }
        catch(Exception e){
            System.out.println("Bank Server Down. Try again later.");
        }  
        
        return amount;
    }

    public double withdrawMoney(double amount){
        try{
            if(balance >= amount){
                balance -= amount;
            }
            else{
                System.out.println("Your account balance is insufficient.");
            }
        }
        catch(Exception e){
            System.out.println("Bank Server Down. Try again later.");
        }  
        
        return amount;
    }


    //default constructor
    BankAccount(){
        name = "anonymous";
        balance = 0;
    }
}

public class AttributesAndMethods {
    public static void main(String[] args) {

        //customer

        BankAccount cust1 = new BankAccount("Rahul", 50000); //constructor called
        System.out.println("Name: " + cust1.getName());
        System.out.println("Current Balance: " + cust1.getBalance());
        System.out.println("Credit account by sum of: " + cust1.addMoney(1000));
        System.out.println("Current Balance: " + cust1.getBalance());

        BankAccount cust0 = new BankAccount();  //constructor called
        System.out.println("Name: " + cust0.getName());
        System.out.println("Current Balance: " + cust0.getBalance());
        System.out.println("Credit account by sum of: " + cust0.addMoney(1000));
        System.out.println("Current Balance: " + cust0.getBalance());
        System.out.println("Debit account by sum of: " + cust0.withdrawMoney(1500));
        System.out.println("Current Balance: " + cust0.getBalance());

        BankAccount cust2 = new BankAccount("Anand", 60000); //constructor called
        System.out.println("Name: " + cust2.getName());
        System.out.println("Current " + cust2.getBalance());
        System.out.println("Credit account by sum of: " + cust2.addMoney(5000));
        System.out.println("Current Balance: " + cust2.getBalance());
    }
}