import java.util.Scanner;

public class editTask implements Actions{
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To edit a  task, please follow the instructions and press ENTER:");
        System.out.println("Enter name of the task to be modified followed by a ',' and then name of the list followed by a ',' and the name of the new task");
        System.out.println("");
        // System.out.println("Enter 0 to RETURN to menu"); find a way to return to menu
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
        Task task = Task.buildTask(parts[2], parts[1]); // creating object
        String name = parts[1];
        for (int i = 0; i < menu.mList.size(); i++) {
            list listo = menu.mList.get(i);
            if (listo.getName().equals(name)) {

                try{
                    for (int j = 0; j < menu.listOfTasks.size(); j++){
                        if(menu.listOfTasks.get(j).getId().equals(parts[0].toString())){
                            menu.listOfTasks.get(j).setId(parts[2].toString());
                        }

                    }
                } catch (Exception e){
                    System.out.println("Task not found");
                }

            }
        System.out.println(task.getId() + " edited to " + task.getName() + " !\n");
    }

}
        }
