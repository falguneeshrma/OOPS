package DesignAndLifecycleManagement;
import java.io.*;
import java.util.*;



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

// class Student {
//     String name;

//     Student(String name) {
//         this.name = name;
//     }
// }
// class ObjectLifecycle {
//     public static void main(String[] args) {
//         Student s = new Student("Alice");
//         System.out.println(s.name);
//     }
// }


//reference counting

// class Demo {}
// class ObjectLifecycle {
//     public static void main(String[] args) {
//         Demo obj1 = new Demo(); // ref cnt = 1
//         Demo obj2 = obj1;      // ref cnt = 2
//         obj1 = null;      // ref cnt = 1
//         obj2 = null;      // ref cnt = 0 - eligible for gc

//         System.gc();
//     }
// }



//memory leaks

// class MemoryLeak{
//     private static List<Object> staticList = new ArrayList<>();
        
//     public void addToStaticList(Object obj){
//         staticList.add(obj);
//     }
// }
// class ObjectLifecycle {
//     public static void main(String[] args) {
//         MemoryLeak demo = new MemoryLeak();
//         for(int i = 0; i < 1000000; i++){
//             demo.addToStaticList(new Object());
//         }

//         System.out.println("Objects added to static list.");
//     }
// }

//cyclic reference

class Node {
    Node next;
}
class ObjectLifecycle {
    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        a.next = b;
        b.next = a; // Cyclic reference formed
    }
}