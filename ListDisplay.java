public class ListDisplay implements Actions {
    /**
     * inserts a title
     */
    @Override
    public void showActionInformation() {
        System.out.println("");
        System.out.println("Here are all the lists: ");
    }

    @Override
    public String readUserInput() {
        throw new UnsupportedOperationException("The requested operation is not supported.");
    }

    @Override
    public void executeAction(String command) {
        for (int i = 0; i < menu.mList.size(); i++) {
            list listo = menu.mList.get(i);
            System.out.println(listo.getName());
        }

    }
}
