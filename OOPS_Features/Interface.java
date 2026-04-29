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

class Interface{
    public static void main(String[] args){
        // Animal cat = new Cat();
        // Animal rabbit = new Rabbit();           // cannot implement two interfaces

        Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();  

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