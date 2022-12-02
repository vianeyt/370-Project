import java.util.ArrayList;

public class Originator {
    private ArrayList<Task> listToSave = new ArrayList<Task>();

    public void setList(ArrayList<Task> newList){
        this.listToSave.clear();
        for(int i=0; i<newList.size();i++){
            this.listToSave.add(newList.get(i));
        }
    }

    public Memento saveToMemento(){
        return new Memento(this.listToSave);
    }

    public ArrayList<Task> restoreFromMemento(Memento memento){
        this.listToSave = memento.getList();
        return this.listToSave;
    }
}
