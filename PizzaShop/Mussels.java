public class Mussels extends NahPizza { 
    public Mussels(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + mussels";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 4;
    }
}
