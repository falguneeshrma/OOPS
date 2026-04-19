package Introduction;

//Example 1


// import java.util.*;
// class Employee {
//     private int salary;
//     public String Name;

//     public Employee() {
//         Name = "Amit";
//         salary = 5000;
//     }
//     public void setName(String s) {
//         Name = s;
//     }
//     public void setSalary(int val) {
//         salary = val;
//     }
//     public int getSalary() {
//         return salary;
//     }
// }


//Example 2

class Account {
    public String Name; 
    public int balance;          

    public Account(String name, int balance) {
        this.Name = name;
        this.balance = balance;
    }
    
    public Account(Account account) {
        this(account.Name, account.balance);
    }
}

//Example 3

class Rectangle{
    public double length;
    public double width;
    public double area;

    //default constructor
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
        this.area = 1.0;
    }

    //parameterized constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //methods
    public void calculateArea(){
        area = this.length * this.width;
    }
    public void displayDetails(){
        System.out.printf("Length : %.2f\n", this.length);
        System.out.printf("Width : %.2f\n", this.width);
        System.out.printf("Area : %.2f\n", this.area);
    }
}



class Constructors {
    public static void main(String[] args) {
       
        // Employee emp1 = new Employee();
        // System.out.println("Default values initialized by the constructor: ");
        // System.out.println("Employee Name: " + emp1.Name);
        // System.out.println("Salary: " + emp1.getSalary());

        Account cust2 = new Account("Raj", 10000);
        Account cust2Copy = new Account(cust2);
        System.out.println("Name of the copied customer: " + cust2Copy.Name);
        System.out.println("Balance of the copied customer: " + cust2Copy.balance);
    
    
        Rectangle rect1 = new Rectangle();
        rect1.displayDetails();
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        rect2.calculateArea();
        rect2.displayDetails();
    }
}
