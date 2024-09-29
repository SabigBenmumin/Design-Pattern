public class Lettuce extends Topping{
    public Lettuce(Burger baseBurger){
        super(baseBurger);
    }

    @Override
    public String getDescription(){
        return baseBurger.getDescription() + " + Lettuce";
    }

    @Override
    public double getCost(){
        return baseBurger.getCost() + 10;
    }
    
}
