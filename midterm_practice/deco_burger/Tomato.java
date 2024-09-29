public class Tomato extends Topping{

    public Tomato(Burger baseBurger){
        super(baseBurger);
    }

    @Override
    public String getDescription(){
        return baseBurger.getDescription() + " + Tomato";
    }

    @Override
    public double getCost(){
        return baseBurger.getCost() + 10;
    }
}