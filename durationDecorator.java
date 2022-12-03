public class durationDecorator implements user{


    protected user tempUser;

    public durationDecorator(user newUser){
        tempUser = newUser;
    }



    public String getDescription() {
        return tempUser.getDescription();
    }

    public double getCost() {
        return tempUser.getCost();
    }
}
