package DesignAndLifecycleManagement;
import java.io.*;


//object lifecycle

// class Demo {
//     void performTask() {
//         System.out.println("Task performed");
//     }
// }
// class ObjectLifecycle {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.performTask();
//     }
// }

//object creation

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
class ObjectLifecycle {
    public static void main(String[] args) {
        Student s = new Student("Alice");
        System.out.println(s.name);
    }
}
