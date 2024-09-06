public abstract class NahPizza implements Pizza {
    protected Pizza decoratedPizza;

    public NahPizza(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription();
    }
    @Override
    public double cost(){
        return decoratedPizza.cost();
    }
}
