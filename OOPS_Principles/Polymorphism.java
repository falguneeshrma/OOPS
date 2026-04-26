package OOPS_Principles;
import java.util.*;

//method overloading - same method, different parameters

class Calculator{
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

//method overriding - same method, different parameters
class Parent{
    void display(){
        System.out.println("This is Parent class");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("This is Child class");
    }
}

//COMPILE-TIME 

//Java Source code
// i) syntax check
// ii) static binding
// iii) Bytecode by Java compiler

//RUN-TIME 

//bytecode executed by JVM
//class loading
//JIT(just in time) bytecode to native machine code of hardware
//dynamic binding
//program execution
//memory management     


class ShapeCalculator{
    private int radius;
    private int length;
    private int width;
    private int base1;
    private int base2;
    private int height;
    private double area;

    public void area(int radius){
        area =  3.14 * radius * radius;
        System.out.println("Area of Circle : " + (int) area);
    }

    public void area(int length, int width){
        area = length * width;
        System.out.println("Area of Rectangle : " + (int) area);
    }

    public void area(int base1, int base2, int height){
        area = ( (base1 + base2) * height) / 2;
        System.out.println("Area of Trapezoid : " + (int) area);
    }
}


class Polymorphism{
    public static void main(String[] args){
        //method overloading
        Calculator calculator = new Calculator();
        System.out.println("Result: " + calculator.add(2, 3)); //compile time polymorphism

        //method overriding
        Child child = new Child(); //runtime polymorphism
        child.display();


        System.out.println("------------------------");


        int radius = 2;
        int length = 2;
        int width = 3;
        int base1 = 2;
        int base2 = 3;
        int height = 2;

        ShapeCalculator shape = new ShapeCalculator();
        shape.area(radius);
        shape.area(length, width);
        shape.area(base1, base2, height);
    }
}