import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> savedLists = new ArrayList<Memento>();

    public void addMemento(Memento memento){
        savedLists.add(memento);
    }

    public Memento getMemento(int index){
        savedLists.remove(index+1);
        return savedLists.get(index);
    }

    public int getSize(){
        return savedLists.size();
    }
}
