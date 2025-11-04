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
    }

    public void showContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
