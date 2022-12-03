public class monthly extends durationDecorator{
    public monthly(user newUser) {
        super(newUser);
    }


    public String getDescription() {
        return tempUser.getDescription() + "Monthly";
    }

    public double getCost() {
        return tempUser.getCost();
    }
}
