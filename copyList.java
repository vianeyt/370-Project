import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class copyList implements Actions {

    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To copy a list, please follow the instructions and press ENTER:");
        System.out.println("Enter name of list you wish to copy");
        System.out.println("");
        System.out.println("Enter 0 to RETURN to menu");
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
        /*
         * approach could be get the name of the list
         * iterate through the array list
         * get the name of the task and interate through the hashlinked list
         * make an object of it and then apply the add method
         */
        /*
         * new edit, instead of copying a task try copying the whole list
         */
        String[] parts = command.split(",");
        String name = parts[0];

        list listCopy = list.buildList(name);
        for (int i = 0; i < menu.mList.size(); i++) {
            list listo = menu.mList.get(i);
            if (listo.getName().equals(name)) { // if the list exists
                System.out.println("List exists!");
                // ArrayList<Task> n = listo.getList();
                System.out.println(listo.getList());
                // for (int j = 0; j < n.size(); j++) {
                // Task copiedTask = (Task) n.get(i);
                // listCopy.addTask(copiedTask);
                // }
            } else {
                System.out.println("list does not exist");
            }
        }
        menu.mList.add(listCopy);
        System.out.println(listCopy.getName() + "list has been added !\n");

    }

}