package RelationshipsAndObjectBehavior;
import java.util.*;

// class Passport implements Cloneable{
//     String passportNumber;
//     Passport(String passportNumber){
//         this.passportNumber =  passportNumber;
//     }

//     @Override
//     protected Object clone() throws CloneNotSupportedException{
//         return super.clone();    // deep cloning creates clone of other object too           
    
//     }
// }

// class Student implements Cloneable{
//     String name;
//     Passport passport;
//     Student(String name, Passport passport){
//         this.name = name;
//         this.passport = passport;
//     }

//     @Override
//     protected Object clone() throws CloneNotSupportedException{
//         // return super.clone();                            //shallow cloning
//         Student student = (Student) super.clone();          //deep cloning
//         student.passport = (Passport) passport.clone();

//         return student;
//     }
// }


// Real World Example

class Book implements Cloneable {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone(); 
    }
}


class Library implements Cloneable {
    String name;
    List<Book> books;
    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    Library shallowClone() throws CloneNotSupportedException {
        return (Library) super.clone(); 
    }

    Library deepClone() throws CloneNotSupportedException {
        Library cloned = (Library) super.clone(); 

        cloned.books = new ArrayList<>();

        for (Book book : this.books) {
            cloned.books.add(book.clone()); 
        }

        return cloned;
    }

    void display() {
        System.out.println("Library : " + name);
        for (Book book : books) {
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }
}


class ObjectCloning{
    public static void main(String[] args) throws CloneNotSupportedException{
        // Passport passport = new Passport("12345678");
        // Student student = new Student("Alice", passport);

        // Student clonedStudent = (Student) student.clone();

        // System.out.println(student.name);
        // System.out.println(student.passport.passportNumber);
        // System.out.println(clonedStudent.name);
        // System.out.println(clonedStudent.passport.passportNumber);

        // System.out.println();

        // //modify clone
        // clonedStudent.name = "Bob";                             //single name modifies - og object field
        // clonedStudent.passport.passportNumber = "987654321";     //both numbers modify - refernce to other object
        // System.out.println(student.name);
        // System.out.println(student.passport.passportNumber);
        // System.out.println(clonedStudent.name);
        // System.out.println(clonedStudent.passport.passportNumber);

        System.out.println();

        String libraryName = "Central_Library";
        String[] titles = { "Frankestein", "King_Arthur_and_the_Round_Table" };
        String[] authors = { "Mary_Shelley", "Rosemary_Sutcliff" };
        int changeIndex = 1;
        String newTitle = "Treasure_Island";
        String newAuthor = "Robert_Louis_Stevenson";

        Library library = new Library(libraryName);
        for (int i = 0; i < titles.length; i++) {
            library.addBook(new Book(titles[i], authors[i]));
        }
        System.out.println("Original Library :");
        library.display();
        library.books.get(changeIndex).title = newTitle;
        library.books.get(changeIndex).author = newAuthor;
        System.out.println("\nAfter Modifications :");
        library.display();
        Library shallowClonedLibrary = library.shallowClone();
        Library deepClonedLibrary = library.deepClone();
        System.out.println("\nShallow Clone :");
        shallowClonedLibrary.display();
        System.out.println("\nDeep Clone :");
        deepClonedLibrary.display();
    }
}