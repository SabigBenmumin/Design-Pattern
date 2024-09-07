public class Cheese extends NahPizza { 
    public Cheese(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + cheese";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 8;
    }
}
