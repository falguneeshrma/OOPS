package RelationshipsAndObjectBehavior;
import java.util.*;

// class Passport{
//     private String name;    
//     Passport(String name){
//         this.name = name;
//     }
// }

// class Student{
//     private String name;
//     private Passport passport;  // class within class and owns it

//     Student(String name, String passportNumber){
//         this.name = name;
//         this.passport = new Passport(passportNumber);   //instance created
//     }
// }





class College{
    private String name;
    private String id;

    College(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void displayDetails(){
        System.out.println("College Name : " + name);
        System.out.println("College ID : " + id);
    }
}

class University{
    private String name;
    private List <College> colleges;

    University(String name){
        this.name = name;
        this.colleges = new ArrayList<>();
    }

    public void addCollege(String collegeName, String collegeId){
        colleges.add(new College(collegeName, collegeId));
    }

    public void displayDetails() {
        System.out.println("University Name : " + name);
        for (College college : colleges) {
            college.displayDetails();
        }
    }

}




class Composition{
    public static void main(String[] args){
        //Student student = new Student("Alice", "12345678");

        System.out.println();

        String universityName = "Global_University";
        String[] collegeNames = { "COEP", "PICT", "VJTI", "WCE", "PCCOE" };
        String[] collegeIds = { "CO8543", "PI9514", "VJ8643", "VF569", "PC9246" };

        University university = new University(universityName);

        for (int i = 0; i < collegeNames.length; i++) {
            university.addCollege(collegeNames[i], collegeIds[i]);
        }
        
        university.displayDetails();
    }
}