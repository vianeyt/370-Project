import java.util.ArrayList;

public class Singleton {
    private static Singleton instance = null;
    private ArrayList<list> mList = new ArrayList<list>();
    private ArrayList<Task> listOfTasks = new ArrayList<Task>();

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public void setList(ArrayList<list> mList){
        this.mList = mList;
    }

    public void setTask(ArrayList<Task> listOfTasks){
        this.listOfTasks = listOfTasks;
    }

    public ArrayList<list> getList(){
        return this.mList;
    }

    public ArrayList<Task> getTask(){
        return this.listOfTasks;
    }

    public void setMessage(String message){
        System.out.println("\nSingleton\n" + message);
    }
}
