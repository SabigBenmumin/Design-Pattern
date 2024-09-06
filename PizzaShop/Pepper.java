public class Pepper extends NahPizza { 
    public Pepper(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + pepper";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 9;
    }
}
