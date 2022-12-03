import java.util.List;
import java.util.Scanner;

public class removeList implements Actions {

    Singleton instance = Singleton.getInstance();

    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To remove a list, please follow the instructions and press ENTER");
        System.out.println("Enter name of list and press ENTER");
        System.out.println("");
    }

    @Override
    public String readUserInput() {
        System.out.println("");
        System.out.println("Enter Information: ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        return userInput;
    }

    @Override
    public void executeAction(String command) {
        instance.setList(menu.mList);
        List<list> mList = instance.getList();
        for(int i = 0; i < mList.size(); i++){
            if(mList.get(i).getName().equals(command)){
                mList.remove(i);
            }
        }
        instance.setMessage("List: " + command + " has been removed.\n");
    }
}
