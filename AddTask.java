import java.util.Scanner;

public class AddTask implements Actions {

    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To add a new task, please follow the instructions and press ENTER:");
        System.out.println("Enter name of list you wish to add this task to followed by the name of the task");
        System.out.println("");
        System.out.println("Enter 0 to RETURN to menu"); // find a way to return to menu
    }

    @Override
    public String readUserInput() {

        System.out.println("");
        System.out.print("Enter Information: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return userInput;

    }

    @Override
    public void executeAction(String command) {
        String[] parts = command.split(",");
        Task task = Task.buildTask(parts[0], parts[1]); // creating object
        String name = parts[1];
        for (int i = 0; i < menu.mList.size(); i++) {
            list listo = menu.mList.get(i);
            if (listo.getName().equals(name)) {
                menu.listOfTasks.add(task);
            }
        }
        System.out.println(task.getName() + " added to " + task.getId() + " !\n");
    }

}
