package Classworks.Classwork13;

public class Сlasswork13 {
    public static void main(String[] args) {
        Contact contact =new Contact("pepa" , "+380962648915");
        Contact contact2 =new Contact("pepa2" , "+915");
        Contact contact3 =new Contact("pepa3" , "+48915");
        ContactManager.add(contact);
        ContactManager.add(contact2);

        ContactManager.add(contact3);
        ContactManager.viewContacts();
    }
}
