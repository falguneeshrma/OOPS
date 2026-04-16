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

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Rahul", 50000);

        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
    }
}