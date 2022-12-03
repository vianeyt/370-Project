import java.util.ArrayList;
//Thread Safe Singleton
public class Singleton {
    private static Singleton instance;
    private ArrayList<list> mList;
    private ArrayList<Task> listOfTasks;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
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
