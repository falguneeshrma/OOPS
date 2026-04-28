package OOPS_Features;
import java.util.*;

//Abstraction
abstract class Car{

    //constructor
    Car(){
        System.out.println("This is a car constructor.");
    }

    abstract public void start();

    public void honk(){
        System.out.println("Peeep...Peeep!");
    }

    public void sunroof(){
        System.out.println("Car has a sunroof!");
    }
}

//hierarchical inheritance - Car, Dealer, ManualCar, AutomaticCar

abstract class Dealer extends Car{
    int numberOfCars;

    //constructor
    Dealer(){
        System.out.println("This is a dealer constructor.");
    }
    Dealer(int numberOfCars){
        System.out.println("This is a parameterised constructor.");
        this.numberOfCars = numberOfCars;
    }
}

class ManualCar extends Dealer{

    //constructor
    ManualCar(){
        super(12);
        System.out.println("This is a manual car constructor.");
    }

    @Override
    public void start(){
        System.out.println("Manual car is starting!");
    }
    public void playMusic(){
        System.out.println("Manual car is now playing music!");
    }   
}

class AutomaticCar extends Dealer{
//constructor
    AutomaticCar(){
        System.out.println("This is a automatic car constructor.");
    }

    @Override
    public void start(){
        System.out.println("Automatic car is starting!");
    }
}


//interface 

interface CarInterface{
    public void start();

    //after Java 8 - default and static

    //default
    default void honk(){
        System.out.println("Peeep...Peeep!");
    }

    //static
    static int numberOfWheels(){
        System.out.println("Wheels: 4");
        return 4; // no need to create instance
    }
}

class ElectricCar implements CarInterface{
    //constructor
    ElectricCar(){
        System.out.println("This is a electric car constructor.");
    }

    @Override
    public void start(){
        System.out.println("Electric car is starting!");
    }
}

class Abstraction{
    public static void main(String[] args){

        Car car = new ManualCar();
        car.start();
        car.honk();
        car.sunroof();

        System.out.println("---------------");
        
        ManualCar manualCar = new ManualCar();
        manualCar.start();
        manualCar.honk();
        manualCar.playMusic();
        manualCar.sunroof();

        System.out.println("---------------");
        
        AutomaticCar autoCar = new AutomaticCar();
        autoCar.start();
        autoCar.honk();
        autoCar.sunroof();

        System.out.println("---------------");
        
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();

        System.out.println("---------------");
        
        CarInterface.numberOfWheels();
    }
}