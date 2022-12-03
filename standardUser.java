public class standardUser implements user {
    @Override
    public String getDescription() {
        return "Standard User";
    }

    @Override
    public double getCost() {
        return 12.00;
    }

}
