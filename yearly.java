public class yearly extends durationDecorator {
    public yearly(user newUser) {
        super(newUser);
    }


    public String getDescription() {
        return tempUser.getDescription() + "Yearly";
    }

    public double getCost() {
        return (tempUser.getCost() * 12) - 12;
    }
}
