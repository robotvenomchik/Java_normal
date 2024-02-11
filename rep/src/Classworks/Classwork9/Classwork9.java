package Classworks.Classwork9;

public class Classwork9 {
    public static void main(String[] args) {
        User user1=new User();
        user1.name="kiril";
        user1.password="1234556abcd";
        user1.login="venomchik";
        System.out.println(user1.login+ user1.password + user1.name);

        user1.print();

    }
}
