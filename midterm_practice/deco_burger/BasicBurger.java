public class BasicBurger implements Burger{
    @Override
    public String getDescription(){
        return "Burger";
    }

    @Override
    public double getCost(){
        return 50;
    }
}
