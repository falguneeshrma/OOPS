package OOPS_Features;
import java.util.*;

//static nested class

// class OuterClass{
//     static int val = 10;
//     String name = "OuterClass";

//     static class InnerClass{
//         public void execute(){
//             System.out.println("Inner class method executed! " + val); //Accessing static variable from OuterClass
//         }
//     }

    // public void execute(){
    //     InnerClass obj3 = new InnerClass(); //Creating object of InnerClass
    //     obj3.execute(); //Accessing static method from InnerClass
    // }

// }


//non-static inner class

// class OuterClass{
//     static int val = 10;
//     String name = "OuterClass";

//     class InnerClass{                //non-static inner class    
//         public void execute(){
//             System.out.println("Inner class method executed! " + val); //Accessing static variable from OuterClass
//         }
//     }

// }


//local inner class

// class OuterClass{
//     int val = 100;

//     public void execute(){      // method of OuterClass
//         final int x = 10;       // variable of OuterClass method
//         class InnerClass{       //InnerClass inside method of OuterClass
//             public void execute(){
//                 // x += 10;  //error
//                 val += 100;  //no error

//                 System.out.println("Inner class method executed! " + x); //error if value is to be changed // val+=10;
//                 System.out.println("Inner class method executed! " + val); //no error if value is to be changed 
//             }
            

//         }

//         InnerClass obj6 = new InnerClass(); //Creating object of InnerClass
//         obj6.execute(); //Calling method of InnerClass by InnerClass instance
//     }
    

// }


// Anonymous class - using interface or abstract class

// interface Sample{
//     public void execute();
// }

abstract Sample{
    public void execute();
}

class InnerClasses{
    public static void main(String[] args){
        System.out.println();
        System.out.println("------------Static Inner Class------------");


        // OuterClass.InnerClass obj1 = new OuterClass.InnerClass(); //Creating object of InnerClass
        // obj1.execute(); //Calling method inside InnerClass

        // OuterClass obj2 = new OuterClass(); //Creating object of OuterClass
        // obj2.execute(); //Calling method inside InnerClass  
        // error - static method triggered by non static outer class without creating object of InnerClass

        System.out.println();
        System.out.println("------------Non-Static Inner Class------------");

        // OuterClass obj4 = new OuterClass(); //Creating object of OuterClass
        // OuterClass.InnerClass obj5 = obj4.new InnerClass(); //Calling method inside non-static InnerClass via instance of OuterClass
        // or 
        // OuterClass.InnerClass obj5 = new OuterClass().new InnerClass(); //Calling method inside non-static InnerClass via instance of OuterClass
        // obj5.execute();

        System.out.println();
        System.out.println("------------Local Inner Class------------");

        // OuterClass obj7 = new OuterClass(); //Creating object of OuterClass
        // obj7.execute();

        System.out.println();
        System.out.println("------------Anonymous Inner Class------------");

        Sample sample = new Sample(){
            public void execute(){
                @Override
                System.out.println("Anonymous Inner Class");
            }
        };
        sample.execute();


    }
}