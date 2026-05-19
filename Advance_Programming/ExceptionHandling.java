package Advance_Programming;
import java.util.*;

// class SelfMadeException extends Exception{
//     SelfMadeException(String exception){
//         super(exception);
//         System.out.println("This is custom exception.");
//     }
// }


//  Real World Example

class InsufficientBalance extends Exception{
    InsufficientBalance(String exception){
        super(exception);
        System.out.println("You do not have enough balance.");
    }
}


class BankBalance{
    String name;
    double balance;

    BankBalance(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void addBalance(double val){
        balance += val;
        System.out.println("Amount is credited.");
    }

    public void withdrawBalance(double val) throws InsufficientBalance{
        if(val < balance){
            balance -= val;
            System.out.println("Amount is debited.");
        }
        else throw new InsufficientBalance("Your current available balance is: " + balance);
    }
}



class ExceptionHandling{

    // private static void readFile() throws Exception{
    //     // throw new Exception();  // throw: it throws an error and does not use try and catch block here
    //     throw new SelfMadeException("No lines of code");
    // }

    // public static void main(String[] args) throws Exception{    // throws: it indicates there might be an expection
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     arr.add(10);
    //     arr.add(15);
    //     try{
    //         System.out.println(arr.get(5)); //error statement
    //         System.out.println("Statement1: after error statement");
    //     }
    //     catch(Exception e){
    //         System.out.println("Catch statement 1" + e.getMessage());
    //     }
    //     finally{
    //         System.out.println("Statement2: final statement");  // closing resources
    //     }

    //     try{
    //         readFile(); // exception statement
    //         System.out.println("Statement3: after exception statement");
    //     }
    //     catch(Exception e){
    //         System.out.println("Catch statement 2 " + e.getMessage());
    //     }
        
    // }


    // Real World Example

    public static void main(String[] args){
        BankBalance cust1 = new BankBalance("Alice", 1000);
        cust1.addBalance(100);
        try{
            cust1.withdrawBalance(1000);
            cust1.withdrawBalance(100);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}