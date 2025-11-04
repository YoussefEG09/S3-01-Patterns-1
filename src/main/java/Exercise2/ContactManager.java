package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContacts(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact successfully added.");
    }

    public void showContacts() {
        if (contacts.isEmpty()){
            System.out.println("No contacts in list.");
            return;
        }
        System.out.println("=== Contact list ===");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
