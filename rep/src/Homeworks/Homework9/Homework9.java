package Homeworks.Homework9;

public class Homework9 {

    public static void main(String[] args){
        Library library = new Library(1);

        Book book1 = new Book("book1", "pepa", 1925);
        Book book2 = new Book("book2", "jedai", 1960);
        Book book3 = new Book("book3", "Kyrylo", 2060);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        library.printBooks();
        System.out.println("-------------------------------------------");

        library.remove("book1");

        System.out.println("-------------------------------------------");

        library.printBooks();

        library.addBook(book1);
        System.out.println("-------------------------------------------");

        library.printBooks();

        System.out.println("-------------              ---------------------                 ---------");

        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("Ivan", 1, 20);
        Student student2 = new Student("Maria", 2, 22);

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        studentManager.addGrade(student1, "Matematika", 85.5);
        studentManager.addGrade(student1, "Physic", 90.0);
        studentManager.addGrade(student2, "History", 75.0);

        System.out.println("Avarage score " + student1.name + ": " + studentManager.getAverageGrade(student1));
        System.out.println("Avarage score " + student2.name + ": " + studentManager.getAverageGrade(student2));

        /*
        CONSOLE
                book 'book1' added
                book 'book2' added
                book 'book3' added
                LIST of books:
                book1 (1925)
                book2 (1960)
                book3 (2060)
                -------------------------------------------
                Homeworks.Homework9.Book 'book1' deleted
                -------------------------------------------
                LIST of books:
                book3 (2060)
                book2 (1960)
                book 'book1' added
                -------------------------------------------
                LIST of books:
                book3 (2060)
                book2 (1960)
                book1 (1925)
                -------------              ---------------------                 ---------
                Homeworks.Homework9.Student Ivan aded
                Homeworks.Homework9.Student Maria aded
                Mark 85.5 subject Matematika for student Ivan added
                Mark 90.0 subject Physic for student Ivan added
                Mark 75.0 subject History for student Maria added
                Avarage score Ivan: 87.75
                Avarage score Maria: 75.0


        *
        * */
    }
}
