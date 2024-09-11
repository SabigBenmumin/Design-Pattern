public class Tomato extends NahPizza { 
    public Tomato(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + tomato";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 3;
    }
}
