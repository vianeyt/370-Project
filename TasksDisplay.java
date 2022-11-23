
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
        menu.listOfTasks.forEach((task) -> {
            System.out.println("List: " + task.getName() + ", Task: " + task.getId());
        });

    }
}
