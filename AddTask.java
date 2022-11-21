import java.util.Scanner;

public class AddTask implements Actions {


    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To add a new task, please follow the instructions and press ENTER:");
        System.out.println("Enter name of list you wish to add this task and then the name of the task");
        System.out.println("");
        System.out.println("Enter 0 to RETURN to menu");
    }



    @Override
    public String readUserInput() {
        while (true) {
            System.out.println("");
            System.out.print("Enter Information: ");
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            
            if(!userInput.equals("0")){
            	String[] parts = userInput.split(",");
            	if(parts.length == 2) {
            		if(list.tasks.get(parts[0]) == null) {
            			return userInput;
            		}
            		else {
            			return userInput;
            		}
            	}
            }
        }
    }
    
    @Override
    public void executeAction(String command) {
        String[] parts = command.split(",");
        Task task = Task.buildTask(parts[0], parts[1]); // creating object 
        list.tasks.put(task.getId(), task);
        ListOfLists designatedList = new ListOfLists();
        designatedList.addTask(task.getId(), task);
        System.out.println(task.getName() + " added to " + task.getId() + " !\n");

    }


}
