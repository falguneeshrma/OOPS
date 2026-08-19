package DesignAndLifecycleManagement;
import java.io.*;


//SRP

// class SalaryCalculator {
//     public double calculateSalary(Employee emp) {
//         // Salary calculation logic
//     }
// }

// class ReportGenerator {
//     public void generateReport(Employee emp) {
//         // Report generation logic
//     }
// }

//OCP
// abstract class Shape{
//     abstract void calculateArea();
// }
// class Rectangle extends Shape{
//     @Override
//     public void calculateArea(){
//         System.out.println("length * breadth");
//     }
// }
// class Circle extends Shape{
//     @Override
//     public void calculateArea(){  
//         System.out.println("Math.PI * radius * radius"); 
//     }
// }



//LSP

//incorrect version - the sparrow can substitute flying bird class but a penguin cannot

// class FlyingBird {
//     public void fly(){
//         System.out.println("I can flyyyyyyyyyyyy....!");
//     }
// }

// class Sparrow extends FlyingBird {
//     @Override
//     public void fly() { 
//         System.out.println("Flying high!"); 
//     }
// }
// class Penguin { 
//     // Penguins do not implement FlyingBird
//     @Override
//     public void fly() { 
//         Throw new UnsupportedOperationException("Penguins can't fly!"); 
//     }
// }

//correct version 
// class Bird{
//     public void eat(){
//         System.out.println("Nummm, nummm, nummmm!");
//     }
// }

// interface Flyable{
//     void fly();
// }

// class Sparrow extends Bird implements Flyable{
//     @Override
//     public void fly() { 
//         System.out.println("Flying high!"); 
//     }
// }

// class Penguin extends Bird{
//     // does not implement fly method
// }



// ISP

// interface Printer {
//     void print();
// }

// interface Scanner {
//     void scan();
// }

// class BasicPrinter implements Printer {
//     @Override
//     public void print(){ 
//         System.out.println("Printing..."); 
//     }
// }

// class AdvancedPrinter implements Printer, Scanner {
//     @Override
//     public void print(){ 
//         System.out.println("Printing..."); 
//     }
//     @Override
//     public void scan(){ 
//         System.out.println("Scnning..."); 
//     }
// }



// DIP

interface PaymentProcessor{
    void processPayment();
}

class UPIPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(){
        System.out.println("Processing payment through UPI");
    }
}

class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void processPayment(){
        System.out.println("Processing payment through Credit Card");
    }
}

class PaymentService{
    private PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor){
        this.processor = processor;
    }

    public void makePayment(){
        processor.processPayment();
    }
}

class CashOnDeliveryProcessor implements PaymentProcessor{
    @Override
    public void processPayment(){
        System.out.println("Processing payment through Cash On Delivery");
    }
}

class SOLID_DesignPrinciples{
    public static void main(String[] args){

     //OCP
        // Shape circle = new Circle();
        // circle.calculateArea();
        // Shape rectangle = new Rectangle();
        // rectangle.calculateArea();

    //LSP
        // FlyingBird sparrow1 = new Sparrow();
        // sparrow1.fly();
        // FlyingBird penguin1 = new Penguin();
        // penguin1.fly(); // throws UnsupportedOperationException

        // Bird sparrow2 = new Sparrow();
        // ((Flyable) sparrow2).fly();
        // Bird penguin2 = new Penguin();
        // penguin2.eat();


    //ISP
        // BasicPrinter printer1 = new BasicPrinter();
        // printer1.print();
        // AdvancedPrinter printer2 = new AdvancedPrinter();
        // printer2.print();
        // printer2.scan();


    //DIP
        PaymentProcessor creditCard = new CreditCardProcessor();
        PaymentService paymentService1 = new PaymentService(creditCard);
        paymentService1.makePayment();

        PaymentService paymentService2 = new PaymentService(new UPIPaymentProcessor());
        paymentService2.makePayment();
    }
}