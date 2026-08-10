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
class FlyingBird {
    public void fly(){
        System.out.println("I can flyyyyyyyyyyyy....!");
    }
}

class Sparrow extends FlyingBird {
    @Override
    public void fly() { 
        System.out.println("Flying high!"); 
    }
}

class Penguin { 
    // Penguins do not implement FlyingBird
}





class SOLID_DesignPrinciples{
    public static void main(String[] args){

     //OCP
        // Shape circle = new Circle();
        // circle.calculateArea();
        // Shape rectangle = new Rectangle();
        // rectangle.calculateArea();

    //LSP
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();
    }
}