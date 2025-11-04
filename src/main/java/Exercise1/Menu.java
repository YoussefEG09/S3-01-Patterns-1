
package Exercise1;

import java.util.Scanner;

public class Menu {
    private final Undo undo;
    private final Scanner scanner;

    public Menu(){
        scanner = new Scanner(System.in);
        undo = Undo.getInstance();
    }

    public void start(){
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1 -> addCommand();
                case 2 -> removeComand();
                case 3 -> listCommands();
                case 0 -> System.out.println("Exiting program....");
                default -> System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }

    private void showMenu(){
        System.out.println("\n--- COMMAND MENU ---");
        System.out.println("1. Add command");
        System.out.println("2. Remove last command");
        System.out.println("3. List commands");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private void addCommand(){
        System.out.println("Enter a command :");
        String cmd = scanner.nextLine();
        undo.addCommand(cmd);
    }

    private void removeComand(){
        undo.removeLastCommand();
    }

    private void listCommands(){
        undo.listCommands();
    }

}
