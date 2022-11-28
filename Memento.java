public class Memento {

    private list sl;

    Memento(list listSave){
        this.sl = listSave;
    }

    public list getList(){
        return this.sl;
    }
}
