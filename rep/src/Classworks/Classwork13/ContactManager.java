package Classworks.Classwork13;

import java.util.HashMap;

public class ContactManager {
    static private HashMap<String, String> listOfContacts= new HashMap<>();

    static public void add(Contact contact){
        listOfContacts.put(contact.getName(), contact.getNumber());

    }
    static public void remove(Contact contact){
        listOfContacts.remove(contact.getName(), contact.getNumber());

    }
    static public void get(Contact contact){
        listOfContacts.get(contact.getName());

    }

    public static HashMap<String, String> getListOfContacts() {
        return listOfContacts;
    }
    public static void viewContacts (){
        for (Object key : listOfContacts.keySet()) {
            System.out.println(key);
            System.out.println(listOfContacts.get(key));
        }
    }
}

