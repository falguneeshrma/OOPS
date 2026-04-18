package Introduction;

class Employee {
    private String name;
    private int salary;

    // public String setName(String n) {
    //     name = n;
    // }

    // public int setName(int s) {
    //     salary = s;
    // }

    //constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    //methods
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class Student{

    //atributes
    private String name;
    private int rollNumber;

    //methods
    public void setDetails(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void getDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll no: " + this.rollNumber);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {

        //employee

        Employee emp1 = new Employee("Rahul", 50000); //constructor called
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());

        //student

        Student student1 = new Student();
        student1.setDetails("Anjali", 1);
        student1.getDetails();
    }
}