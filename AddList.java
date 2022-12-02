import java.util.Scanner;

public class AddList implements Actions {

	@Override
	public void showActionInformation() {
        System.out.println("");
        System.out.println("To add a new list, please follow the instructions and press ENTER:");
        System.out.println("Enter name of lists and press ENTER");
        System.out.println("");
        // System.out.println("Enter 0 to RETURN to menu"); come up with a way to return to menu
	}

    public String readUserInput() {
            System.out.println("");
            System.out.print("Enter Information: ");
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();
            return userInput;
        }

	@Override
    public void executeAction(String command) {
        String[] parts = command.split(",");
        list list1 =  list.buildList(parts[0]);
//        ListOfLists mList = new ListOfLists();
        menu.mList.add(list1);
        System.out.println(list1.getName() + " has been added!\n");

    }

}
