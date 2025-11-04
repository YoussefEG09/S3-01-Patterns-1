package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private List<String> commands;


    private Undo() {
        commands = new ArrayList<>();
    }

    public static Undo getInstance(){
       if (instance == null) {
           instance = new Undo();
       }
       return instance;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void removeLastCommand(){
        if (!commands.isEmpty()) {
            commands.remove(commands.size()-1);
        } else {
            System.out.println("There are no commands to be removed.");
        }
    }

    public void listCommands(){
        if (commands.isEmpty()) {
            System.out.println("List of commands is empty.");
        } else {
            System.out.println("Commands list :");
            for (String cmd : commands) {
                System.out.println(" -" + cmd);
            }
        }
    }

}
