package OOPS_Principles;
import java.util.*;


// Parent class or super class


class School{
    private String name;        //attribute

    School(){                   //constructor
        name = "DPS";
    }
    void printSchoolName(){     //method
        System.out.println("School name: " + name);
    }

    void number(){
        System.out.println("One");
    }
}

// Intermediatery class or middle class

class Student extends School{
    private String name;        //attribute

    Student(String name){       //constructor
        this.name = name;
    }

    void printStudentName(){    //method
        System.out.println("Student name: " + name);
    }

    @Override                      //override
    void number(){
        super.number();
        System.out.println("N"); 
    }
}

// Intermediatery class or middle class

class Teacher extends School{
    private String name;        //attribute
    private String subjectName;

    Teacher(String name, String subjectName){       //constructor
        this.name = name;
        this.subjectName = subjectName;
    }

    void printTeacherInfo(){    //method
        System.out.println("Teacher name: " + name);
        System.out.println("Subject name: " + subjectName);
    }

    @Override                       //override
    void number(){
        super.number();
        System.out.println("M"); 
    }
}

// Child class or sub class

class Parent extends Student{
    private String name;                        //attribute

    Parent(String name, String studentName){    //constructor
        super(studentName);
        this.name = name;
    }

    void printParentName(){                     //method
        System.out.println("Parent name: " + name);
    }

    @Override                       //override
    void number(){
        super.number();
        System.out.println("2N"); 
    }
}

class Inheritance{
    public static void main(String[] args){

        // School school = new School();
        // school.printSchoolName();
        // school.number();

        System.out.println("--------------------- ");

        //single level
        Student student = new Student("Alice");
        student.printStudentName();
        student.printSchoolName();
        student.number();

        System.out.println("--------------------- ");

        //hierarchical level
        Teacher teacher = new Teacher("John", "Maths");
        teacher.printTeacherInfo();
        teacher.printSchoolName();
        teacher.number();

        System.out.println("--------------------- ");

        //mutlti level 
        Parent parent = new Parent("Dad", "Ali");
        parent.printParentName();
        parent.printStudentName();
        parent.printSchoolName();
        parent.number();
       
        
    }
    
    
}