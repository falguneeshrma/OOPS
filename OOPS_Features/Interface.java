package OOPS_Features;
import java.util.*;


interface Living{

    void breathe();
}

interface Animal extends Living{                   //interface inheritance

    void eat();
    void sleep();
    // void reproduce();
    static final int kittens = 0;                  //final variable in an interface 

    //default method
    default void sound(){
        System.out.println("Animal makes a sound.");
    }
    //static method
    static void hear(){
        System.out.println("Animals can hear.");
    }
}

// class Cat implements Animal, Living{
class Cat implements Animal{
    @Override
    public void breathe(){
        System.out.println("Cats can breathe.");
    }
    @Override
    public void eat(){
        System.out.println("Cat eats fishes.");
    }
    @Override
    public void sleep(){
        System.out.println("Cat sleeps in a cattery.");
    }
    // @Override
    // public void reproduce(){ 
    //     kittens++;                           // throws an error
    // }
    @Override
    public void sound(){
        System.out.println("Cat meows.");
    }
}

// class Rabbit implements Animal, Living{
class Rabbit implements Animal{     
    @Override
    public void breathe(){
        System.out.println("Rabbits can breathe.");
    }
    @Override
    public void eat(){
        System.out.println("Rabbit eats carrots.");
    }
    @Override
    public void sleep(){
        System.out.println("Rabbit sleeps in a burrow.");
    }
    // @Override
    // public void reproduce(){
    //     kittens++;                              // throws an error
    // }
    @Override
    public void sound(){
        System.out.println("Rabbit oinks.");
    }
}


//Real world Example

interface PaymentGateway{
    void processPayment( double amount );
}

class CreditCardPayment implements PaymentGateway{
    @Override
    public void processPayment( double amount ){
        System.out.printf("Processing credit card payment of %.2f%n", amount);
    }
}

class UPIPayment implements PaymentGateway{
    @Override
    public void processPayment( double amount ){
        System.out.printf("Processing UPI payment of %.2f%n", amount);
    }
}


class Interface{
    public static void main(String[] args){

        String[] paymentMethod = { "credit", "upi" };
        double[] paymentValue = { 284.5, 27476.2 };

        // Process payments based on method
        for (int i = 0; i < paymentMethod.length; i++) {
            PaymentGateway paymentGateway;
            if (paymentMethod[i].equals("credit")) {
                paymentGateway = new CreditCardPayment();
            } else if (paymentMethod[i].equals("upi")) {
                paymentGateway = new UPIPayment();
            } else {
                continue; // If payment method is unknown
            }
            paymentGateway.processPayment(paymentValue[i]);
        }

        System.out.println();

        System.out.println("------------------------------------");

        System.out.println();

        
        // Animal cat = new Cat();
        // Animal rabbit = new Rabbit();           // cannot implement two interfaces

        Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();              // can implement two interfaces


        Animal.hear();
        System.out.println(Animal.kittens);

        System.out.println();

        cat.eat();
        cat.sleep();
        // cat.reproduce();                         //throws error
        cat.sound();
        cat.breathe();

        System.out.println();

        rabbit.eat();
        rabbit.sleep();
        // rabbit.reproduce();                      //throws error
        rabbit.sound();
        rabbit.breathe();

    }
}