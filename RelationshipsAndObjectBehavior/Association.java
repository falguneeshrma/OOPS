package RelationshipsAndObjectBehavior;
import java.util.*;


//one to one relationship

// class Passport{
//     private String passportNumber;
    
//     //constructor
//     Passport(String passportNumber){
//         this.passportNumber = passportNumber;
//     }

//     public String getPassportNumber(){
//         return passportNumber;
//     }
// }

// class Student{
//     private String name;
//     private Passport passport;      

//     //constructor
//     Student(String name, Passport passport){
//         this.name = name;
//         this.passport = passport;
//     }

//     public void displayDetails(){
//         System.out.println("Student name: " + name);
//         System.out.println("Passport number: " + passport.getPassportNumber());
//     }
// }


//one to many relationship

class Student{
    private String name;  
    private String id; 

    //constructor
    Student(String name,String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}

class College{
    private String name;   
    private List<Student> students;

    //constructor
    College(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void printAllStudents(){
        for( int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            System.out.println("id: " + student.getId() + ", Name: " + student.getName());
        }
    }
}


class Association{
    public static void main(String[] args){

        System.out.println();
        System.out.println("------------ One-to-One Relationship ------------");

        // Passport passport = new Passport("12345678");
        // Student student = new Student("Alice", passport);
        // student.displayDetails();

        System.out.println();
        System.out.println("------------ One-to-One Relationship ------------");

        Student student1 = new Student("Alice ", "1");
        Student student2 = new Student("Bob ", "2");

        College college = new College("ABC");
        college.addStudent(student1);
        college.addStudent(student2);
        college.printAllStudents();

    }
}