import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class list {
    private String id;
    private String name;
    public static boolean applicationRunning = true;

    /*
     * The list which contains ToDoTask
     */
    public ArrayList<Task> list = new ArrayList<Task>();

    public list() {

    }

    public list(String name) {
        this.name = name;
        this.list = new ArrayList<Task>(); // empty array list for now
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getList() {
        return this.list;
    }

    public Task getTask(String name) {
        for (Task task : list) { // iterates through the list to find the task
            if (task.getName().equals(name)) { // verifies if tasks exists in list
                return task; // if so returns task if not returns null
            }
        }
        return null;
    }

    public void addTask(Task task) {
        this.list.add(task);
    }

    public Task removeTask(String taskName) {
        for (Task task : list) {
            if (task.getName().equals(taskName)) {
                list.remove(task);
                return task;
            }
        }
        return null;
    }

    public static list buildList(String name) {
        list list = new list();
        list.setName(name);

        return list;
    }

}