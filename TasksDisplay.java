
public class TasksDisplay implements Actions {

    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("These are all the tasks currently");
    }


    @Override
    public String readUserInput() {
        throw new UnsupportedOperationException("The requested operation is not supported.");
    }

    @Override
    public void executeAction(String command) {
        list.tasks.forEach((key, task) -> {
            System.out.println("ID: " + task.getId() + ", Name: " + task.getName());
        });

    }
}