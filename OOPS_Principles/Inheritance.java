package OOPS_Principles;
import java.util.*;


// Parent class or super class


// class School{
//     private String name;        //attribute

//     School(){                   //constructor
//         name = "DPS";
//     }
//     void printSchoolName(){     //method
//         System.out.println("School name: " + name);
//     }

//     void number(){
//         System.out.println("One");
//     }
// }

// Intermediatery class or middle class

// class Student extends School{
//     private String name;        //attribute

//     Student(String name){       //constructor
//         this.name = name;
//     }

//     void printStudentName(){    //method
//         System.out.println("Student name: " + name);
//     }

//     @Override                      //override
//     void number(){
//         super.number();
//         System.out.println("N"); 
//     }
// }

// // Intermediatery class or middle class

// class Teacher extends School{
//     private String name;        //attribute
//     private String subjectName;

//     Teacher(String name, String subjectName){       //constructor
//         this.name = name;
//         this.subjectName = subjectName;
//     }

//     void printTeacherInfo(){    //method
//         System.out.println("Teacher name: " + name);
//         System.out.println("Subject name: " + subjectName);
//     }

//     @Override                       //override
//     void number(){
//         super.number();
//         System.out.println("M"); 
//     }
// }

// Child class or sub class

// class Parent extends Student{
//     private String name;                        //attribute

//     Parent(String name, String studentName){    //constructor
//         super(studentName);
//         this.name = name;
//     }

//     void printParentName(){                     //method
//         System.out.println("Parent name: " + name);
//     }

//     @Override                       //override
//     void number(){
//         super.number();
//         System.out.println("2N"); 
//     }
// }




//Real life example - Catlogue

class Product{
    private String name;
    private String category;
    private double price;
    Product(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product{
    private int warrantyPeriodInYears;
    private String brand;


    Electronics(int warrantyPeriodInYears, String brand, String name, double price){
        super(name, "Electronics", price);
        this.warrantyPeriodInYears = warrantyPeriodInYears;
        this.brand = brand;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Period In Years: " + warrantyPeriodInYears);
        System.out.println("Brand: " + brand);
    }

}

class Tshirts extends Product{
    private String size;
    private String color;


    Tshirts( String color, String size, String name, double price){
        super(name, "Tshirts", price);
        this.color = color;
        this.size = size;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
    }

    
}

// Real life example - employee hierarchy
class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Team Size : " + teamSize);
    }
}
class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + specialization);
    }
}



class Inheritance{
    public static void main(String[] args){

        // School school = new School();
        // school.printSchoolName();
        // school.number();

        // System.out.println("--------------------- ");

        //single level
        // Student student = new Student("Alice");
        // student.printStudentName();
        // student.printSchoolName();
        // student.number();

        // System.out.println("--------------------- ");

        //hierarchical level
        // Teacher teacher = new Teacher("John", "Maths");
        // teacher.printTeacherInfo();
        // teacher.printSchoolName();
        // teacher.number();

        // System.out.println("--------------------- ");

        //mutlti level 
        // Parent parent = new Parent("Dad", "Ali");
        // parent.printParentName();
        // parent.printStudentName();
        // parent.printSchoolName();
        // parent.number();

        // System.out.println("--------------------- ");

        // Electronics electronics = new Electronics(2, "HP", "Laptop", 60000);
        // electronics.displayDetails();

        // System.out.println("--------------------- ");

        // Tshirts tshirts = new Tshirts("blue", "M", "Polo", 1000);
        // tshirts.displayDetails();
        

        String M_name = "Jax";
        int M_id = 101;
        int M_teamSize = 8;
        String E_name = "William";
        int E_id = 202;
        String E_specialization = "Backend Developer";
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();
        System.out.println();
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("Engineer Details");
        engineer.displayDetails();
    }
    
    
}