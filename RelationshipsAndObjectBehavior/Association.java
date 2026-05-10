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

// class Student{
//     private String name;  
//     private String id; 

//     //constructor
//     Student(String name,String id){
//         this.name = name;
//         this.id = id;
//     }

//     public String getName(){
//         return name;
//     }

//     public String getId(){
//         return id;
//     }
// }

// class College{
//     private String name;   
//     private List<Student> students;

//     //constructor
//     College(String name){
//         this.name = name;
//         students = new ArrayList<>();
//     }

//     public void addStudent(Student student){
//         students.add(student);
//     }
//     public void printAllStudents(){
//         for( int i = 0; i < students.size(); i++){
//             Student student = students.get(i);
//             System.out.println("id: " + student.getId() + ", Name: " + student.getName());
//         }
//     }
// }

//many to many relationship

class Student{
    private String name;
    private List<Course> courses;

    public Student(String name){
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getName(){
        return name;
    }

    public void displayAllCourses(){
        for(int i = 0; i < courses.size(); i++){
            System.out.println(courses.get(i).getName());
        }
    }
}

class Course{
    private String name;
    private List<Student> students;

    public Course(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getName(){
        return name;
    }

    public void displayAllStudents(){
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName());
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
        System.out.println("------------ One-to-Many Relationship ------------");

        // Student student1 = new Student("Alice ", "1");
        // Student student2 = new Student("Bob ", "2");

        // College college = new College("ABC");
        // college.addStudent(student1);
        // college.addStudent(student2);
        // college.printAllStudents();


        System.out.println();
        System.out.println("------------ Many-to-Many Relationship ------------");

        Course c1 = new Course("Maths");
        Course c2 = new Course("CS");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Carl");

        s1.addCourse(c1);
        s1.addCourse(c2);
        c1.addStudent(s1);
        c1.addStudent(s2);

        s2.addCourse(c1);
        c1.addStudent(s2);

        s3.addCourse(c2);
        c2.addStudent(s3);

        System.out.println("Students enrolled in Course 1:");
        c1.displayAllStudents();
        System.out.println();
        System.out.println("Students enrolled in Course 2:");
        c2.displayAllStudents();
        System.out.println();
        System.out.println("Student 1 is enrolled in following Courses:");
        s1.displayAllCourses();
        System.out.println();
        System.out.println("Student 2 is enrolled in following Courses:");
        s2.displayAllCourses();
        System.out.println();
        System.out.println("Student 3 is enrolled in following Courses:");
        s3.displayAllCourses();

    }
}