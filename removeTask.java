import java.util.List;
import java.util.Scanner;

public class removeTask implements Actions {

    Singleton instance = Singleton.getInstance();

    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To remove a task, please follow the instructions and press ENTER");
        System.out.println("Enter name of the task and press ENTER");
        System.out.println("");
    }

    @Override
    public String readUserInput() {
        System.out.println("");
        System.out.println("Enter Information");
        Scanner t = new Scanner(System.in);
        String userInput = t.nextLine();
        return userInput;
    }

    @Override
    public void executeAction(String command) {
        instance.setTask(menu.listOfTasks);
        List<Task> listOfTasks = instance.getTask();
        for (int i = 0; i < listOfTasks.size(); i++) {
            if (listOfTasks.get(i).getId().equals(command)) {
                listOfTasks.remove(i);
            }
        }
        instance.setMessage("Task: " + command + " has been removed.\n");
    }
}
