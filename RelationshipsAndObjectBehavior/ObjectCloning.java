package RelationshipsAndObjectBehavior;
import java.util.*;

class Passport implements Cloneable{
    String passportNumber;
    Passport(String passportNumber){
        this.passportNumber =  passportNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();    // deep cloning creates clone of other object too           
    
    }
}

class Student implements Cloneable{
    String name;
    Passport passport;
    Student(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        // return super.clone();                            //shallow cloning
        Student student = (Student) super.clone();          //deep cloning
        student.passport = (Passport) passport.clone();

        return student;
    }
}

class ObjectCloning{
    public static void main(String[] args)throws CloneNotSupportedException{
        Passport passport = new Passport("12345678");
        Student student = new Student("Alice", passport);

        Student clonedStudent = (Student) student.clone();

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);

        System.out.println();

        //modify clone
        clonedStudent.name = "Bob";                             //single name modifies - og object field
        clonedStudent.passport.passportNumber = "987654321";     //both numbers modify - refernce to other object
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
    }
}