package OOPS_Principles;
import java.util.*;


//public specifier

// class Employee{
//     public String name; //public attribute

//     public void displayName(){ //public method
//         System.out.println("Name: " + name);
//     }
// }


//private specifier

// class BankAccount{
//     private double balance; //private attribute

//     //controlled acces through public methods - getter, deposit
//     public double getBalance(){
//         return balance;
//     }

//     public void deposit(double amount){
//         if(amount > 0){
//             balance += amount;
//         }
//     }
// }


//protected specifier

// class Vehicle{
//     protected String type; //protected attribute

//     protected void displayType(){ //protected method
//         System.out.println("Vehicle type: " + type);
//     }
// }
// class Car extends Vehicle{
//     public Car(){
//         this.type = "Car"; //accessible in sub class
//         System.out.println(this.type);
//     }
// }

class PackageDemo {
    void showMessage() { // Default access
        System.out.println("Default access in the same package.");
    }
}

class Access_Specifiers{
    public static void main(String[] args){

        // Employee emp = new Employee();
        // emp.name = "Alice";
        // emp.displayName();

        // BankAccount acc = new BankAccount();
        // System.out.println("Balance: " + acc.getBalance());
        // // System.out.println(acc.balance); //throws err
        // acc.deposit(1000.0);
        // System.out.println("Balance: " + acc.getBalance());

        // Vehicle car = new Vehicle();
        // car.displayType(); //null bcuz it's protected

        PackageDemo demo = new PackageDemo();
        demo.showMessage(); // Accessible bcuz it's in the same package
    }
}
