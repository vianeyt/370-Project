
public class Task {

    private String id; // name of tasks
    private String name; // name of list it belongs to

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

    public static Task buildTask(String id, String name) {
        Task task = new Task();

        task.setId(id);
        task.setName(name);
        return task;
    }

    @Override
    public String toString() {
        return id + "," + name;
    }

}