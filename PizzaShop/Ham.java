public class Ham extends NahPizza { 
    public Ham(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " + Ham";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 15;
    }
}
