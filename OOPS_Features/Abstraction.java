package OOPS_Features;
import java.util.*;

//Abstraction
abstract class Car{
    abstract public void start();
    public void honk(){
        System.out.println("Peeep...Peeep!");
    }
}

class ManualCar extends Car{
    public void start(){
        System.out.println("Manual car is starting!");
    }
    public void playMusic(){
        System.out.println("Manual car is now playing music!");
    }   
}

class AutomaticCar extends Car{
    public void start(){
        System.out.println("Automatic car is starting!");
    }
}

class Abstraction{
    public static void main(String[] args){

        Car car = new ManualCar();
        car.start();
        car.honk();

        System.out.println("---------------");
        
        ManualCar manualCar = new ManualCar();
        manualCar.start();
        manualCar.honk();
        manualCar.playMusic();

        System.out.println("---------------");
        
        AutomaticCar autoCar = new AutomaticCar();
        autoCar.start();
        autoCar.honk();
    }
}