import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class menu {
    public static ArrayList<list> mList = new ArrayList<list>();
    public static ArrayList<Task> listOfTasks = new ArrayList<Task>();

    public void start() {
        while (list.applicationRunning) {
            showMenu();
            int actionNumber = readAction();
            executeAction(actionNumber);

        }
    }

    public void executeAction(int actionNumber) {
        Actions action;
        switch (actionNumber) {
            case Actions.createList:
                action = new AddList();
                action.showActionInformation();
                String command = action.readUserInput();
                if (!command.equals("0"))
                    action.executeAction(command);
                break;

            case Actions.addTask:
                action = new AddTask();
                action.showActionInformation();
                String command1 = action.readUserInput();
                if (!command1.equals("0"))
                    action.executeAction(command1);
                break;

            // case Actions.copyTask:
            // if (list.tasks.size() > 0) {
            // action = new copyTask();
            // action.showActionInformation();
            // action.executeAction(null);
            // } else {
            // System.out.println("Your list is empty, add tasks first! ");
            // }
            case Actions.displayTask:
                if (listOfTasks.size() > 0) {
                    action = new TasksDisplay();
                    action.showActionInformation();
                    action.executeAction(null);
                } else {
                    System.out.println("Your list is empty, add tasks first! ");
                }
                break;
            case Actions.displayLists:
                if (listOfTasks.size() > 0) {
                    action = new ListDisplay();
                    action.showActionInformation();
                    action.executeAction(null);
                } else {
                    System.out.println("Your list is empty, add tasks first! ");
                }
                break;
            case Actions.exitProgram:
                list.applicationRunning = false;
                break;

        }
    }

    public static void showMenu() {
        String menu = "1. Create a list"
                + "\n2. Add a task."
                + "\n3. Remove a list"
                + "\n4. Remove a task"
                + "\n5. Copy a task"
                + "\n6. Edit a task"
                + "\n7. Display all task"
                + "\n8. Display all lists"
                + "\n9. Exit program";
        System.out.println(menu);
    }

    public int readAction() {
        List<Integer> availableActions = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        while (true) {
            try {
                System.out.print("Enter action: ");
                Scanner scan = new Scanner(System.in);
                int action = scan.nextInt();
                if (availableActions.contains(action)) {
                    return action;
                } else {
                    System.out.println("Please enter a valid action from the list: ");
                }
            } catch (Exception e) {
                System.out.println("Action must be a number...");

            }
        }
    }
}