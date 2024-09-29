public class Cheese extends Topping{
    public Cheese(Burger baseBurger){
        super(baseBurger);
    }
    @Override
    public String getDescription(){
        return baseBurger.getDescription() + " + Cheese";
    }
    @Override
    public double getCost(){
        return baseBurger.getCost() + 20;
    }
    
}
