package Homeworks.Homework11;


public class Main {
    public static void main(String[] args) {
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
        System.out.println("Кількість книг у бібліотеці \'" + Library.countBooksInLibrary(library)+"\'");

        System.out.println("-------------              ---------------------                 ---------");
        System.out.println("-------------              ---------------------                 ---------");
        System.out.println("-------------              ---------------------                 ---------");
        System.out.println("-------------              ---------------------                 ---------");
        Bank bank = new Bank();

        bank.createAccount("Kiril Lypenko");
        bank.createAccount("Kiril Lypenko 2");

        BankAccount account1 = bank.getAccount("Kiril Lypenko");
        BankAccount account2 = bank.getAccount("Kiril Lypenko 2");

        System.out.println(account1.moneyStatus());
        System.out.println(account2.moneyStatus());

        account1.addMoney(1000.0);
        account2.addMoney(500.0);

        System.out.println(account1.moneyStatus());
        System.out.println(account2.moneyStatus());

        account1.transfer(account2, 200.0);
        System.out.println(account1.moneyStatus());
        System.out.println(account2.moneyStatus());


        bank.lockAccount("Kiril Lypenko");
        account1.withDrawMoney(50.0);

        System.out.println(account1.moneyStatus());
        System.out.println(account2.moneyStatus());

        bank.unlockAccount("Kiril Lypenko");
        account1.withDrawMoney(50.0);

        System.out.println(account1.moneyStatus());
        System.out.println(account2.moneyStatus());

        System.out.println("-------------              ---------------------                 ---------");
        System.out.println("-------------              ---------------------                 ---------");
        System.out.println("-------------              ---------------------                 ---------");
        System.out.println("-------------              ---------------------                 ---------");

        Company company = new Company();

        company.addEmploye("Mark Cucerberg", 5000.0, "Facebook");
        company.addEmploye("Master Liu", 4000.0, "Kung fu");
        company.addEmploye("Bob", 4500.0, "office plankton");

        company.removeEmploye("Bob");

        company.printAllEmployes();

        double averageSalary = Company.calculateAverageSalary(company.getEmployes());
        System.out.println("Average salary " + averageSalary);
    }
}
