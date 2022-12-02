import java.util.ArrayList;

public class Memento {

    private ArrayList<Task> sl = new ArrayList<Task>();


    Memento(ArrayList<Task> listSave){
        for(int i=0; i<listSave.size();i++){
            this.sl.add(listSave.get(i));
        }
    }

    public ArrayList<Task> getList(){
        return this.sl;
    }
}
