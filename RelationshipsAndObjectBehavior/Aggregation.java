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
    private Passport passport;  // class within class but does not own it

    Student(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }
}

class Aggregation{
    public static void main(String[] args){
        Passport passport = new Passport("12345678");
        Student student = new Student("Alice", passport);
    }
}