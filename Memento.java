import java.util.ArrayList;

public class Memento {

    private ArrayList<Task> currList = new ArrayList<Task>();


    Memento(ArrayList<Task> listSave){
        for(int i=0; i<listSave.size();i++){
            this.currList.add(listSave.get(i));
        }
    }

    public ArrayList<Task> getList(){
        return this.currList;
    }
}
