import java.util.Scanner;

public class removeList implements Actions {
    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("To remove a list, please follow the instructions and press ENTER");
        System.out.println("Enter name of lists and press ENTER");
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

    }
}
