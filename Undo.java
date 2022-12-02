public class Undo implements Actions {

    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("Executing Undo...");
        System.out.println("");
        
    }

    @Override
    public String readUserInput() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void executeAction(String command) {
        // TODO Auto-generated method stub
        int index = Integer.parseInt(command);
        menu.listOfTasks = menu.originator.restoreFromMemento(menu.caretaker.getMemento(index));
    }
    
}
