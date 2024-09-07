public class Pineapple extends NahPizza { 
    public Pineapple(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + pineapple";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 5;
    }
}
