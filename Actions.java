interface Actions {
    public static int createList = 1; // - edison
    public static int addTask = 2; // - edison
    public static int removeList = 3; // chirag
    public static int removeTask = 4; // -chirag
    public static int editTask = 5; // - ergys
    public static int displayTask = 6; // done -v
    public static int displayLists = 7; // done -v
    public static int undo = 8;
    public static int exitProgram = 9; // done -v

    /*
     * displays the description of the action
     */
    public abstract void showActionInformation();

    /*
     * method that takes the users input
     */
    public abstract String readUserInput();

    /*
     * method that uses the users input to execute the command binded to the choice
     */
    public abstract void executeAction(String command);
}