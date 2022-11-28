import java.util.Scanner;

public class removeTask implements Actions {
    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To remove a task, please follow the instructions and press ENTER");
        System.out.println("Enter name of the task followed by a ',' and then name of the list");
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
        for(int i = 0; i < menu.mList.size(); i++){     // This deletes the first item in the list
            menu.listOfTasks.remove(i);                 // Not sure about how to implement this feature.
        }
//        menu.listOfTasks.remove(command);             // I thought this alone would work to delete task
    }                                                   // but not sure why it doesn't. Trying to figure it out

}
