package Exercise2;

import Exercise2.AbstractFactory.ContactFactory;
import Exercise2.ConcreteFactories.SpainFactory;
import Exercise2.ConcreteFactories.USFactory;

import java.util.Scanner;

public class Menu {
    private final ContactManager contactManager;
    private final Scanner scanner;


    public Menu() {
        this.contactManager = new ContactManager();
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        boolean running = true;

        while (running) {
            printMenu();
            int option = getUserOption();

            switch (option) {
                case 1 -> addContact(new SpainFactory(), "Spain");
                case 2 -> addContact(new USFactory(), "US");
                case 3 -> contactManager.showContacts();
                case 4 -> {
                    running = false;
                    System.out.println("Exiting program...");
                }
                default -> System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n=== Contact Manager    ===");
        System.out.println("1. Add contact (Spain)");
        System.out.println("2. Add contact (US)");
        System.out.println("3. Show all contacts");
        System.out.println("4. Exit");
        System.out.print("Option: ");
    }

    private int getUserOption(){
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter a number: ");
            scanner.next();
        }
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public void addContact(ContactFactory contactFactory, String country) {
        System.out.println("Adding contact for " + country);
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Introduce street: ");
        String street = scanner.nextLine();
        System.out.println("Introduce city: ");
        String city = scanner.nextLine();
        System.out.println("Introduce Phone Number: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, contactFactory.createAddress(street,city),
                contactFactory.createPhoneNumber(phone));
        contactManager.addContacts(contact);

    }
}


