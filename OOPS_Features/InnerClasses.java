package OOPS_Features;
import java.util.*;

class OuterClass{
    static int val = 10;
    String name = "OuterClass";

    static class InnerClass{
        public void execute(){
            System.out.println("Inner class executed! " + val); //Accessing static variable from OuterClass
        }
    }
}

class InnerClasses{
    public static void main(String[] args){
        OuterClass.InnerClass obj1 = new OuterClass.InnerClass(); //Creating object of InnerClass
        obj1.execute(); //Calling method inside InnerClass
    }
}