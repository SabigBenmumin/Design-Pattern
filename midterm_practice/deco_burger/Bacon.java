public class Bacon extends Topping{
    public Bacon(Burger baseBurger){
        super(baseBurger);
    }

    @Override
    public String getDescription(){
        return baseBurger.getDescription() + " + Bacon";
    }

    @Override
    public double getCost(){
        return baseBurger.getCost() + 30;
    }
    
}
