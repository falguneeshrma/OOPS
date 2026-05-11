package RelationshipsAndObjectBehavior;
import java.util.*;

class Passport{
    private String name;    
    Passport(String name){
        this.name = name;
    }
}

class Student{
    private String name;
    private Passport passport;  // class within class and owns it

    Student(String name, String passportNumber){
        this.name = name;
        this.passport = new Passport(passportNumber);   //instance created
    }
}

class Composition{
    public static void main(String[] args){
        Student student = new Student("Alice", "12345678");
    }
}