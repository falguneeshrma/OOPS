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


class Polymorphism{
    public static void main(String[] args){
        //method overloading
        Calculator calculator = new Calculator();
        System.out.println("Result: " + calculator.add(2, 3)); //compile time polymorphism

        //method overriding
        Child child = new Child(); //runtime polymorphism
        child.display();
    }
}