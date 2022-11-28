public class Originator {
    private list listToSave;

    public void setList(list newList){
        this.listToSave = newList;
    }

    public Memento saveToMemento(){
        return new Memento(this.listToSave);
    }

    public list restoreFromMemento(Memento memento){
        listToSave = memento.getList();
        return listToSave;
    }
}
