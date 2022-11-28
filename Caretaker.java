import java.util.ArrayList;

import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> savedLists = new ArrayList<Memento>();

    public void addMemento(Memento memento){
        savedLists.add(memento);
    }

    public Memento getMemento(int i){
        return savedLists.get(i);
    }
}
