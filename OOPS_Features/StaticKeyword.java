package OOPS_Features;
import java.util.*;

class Maths{
    static int count = 0; //static variable

    //constructor
    Maths(){
        count++;
    }

    void displayCount(){
        System.out.println("Count: " + count);
    }

    //static method
    static int sum(int a, int b){
        return a + b;
    }

    void displaySum(){
        int result = Maths.sum(2,3);
        System.out.println("Addition: " + result);
        //non - static method can call static method 
        //static method cannot call non -static method

    }
}


class StaticKeyword{
    public static void main(String[] args){
        Maths c1 = new Maths();
        c1.displayCount(); //modified by obj 1
        Maths c2 = new Maths();
        c1.displayCount(); //modified by obj 1
        c2.displayCount();

        c1.displaySum();

        Maths.sum(2,3); // Calling static method without object creation
    }
}