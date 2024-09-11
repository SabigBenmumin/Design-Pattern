public class Shrimp extends NahPizza { 
    public Shrimp(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + shrimp";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 5;
    }
}
