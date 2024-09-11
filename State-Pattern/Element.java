public abstract class Element implements Coffee{
    public Coffee essentialCoffee;

    public Element(Coffee essentialCoffee){
        this.essentialCoffee = essentialCoffee;
    }

    @Override
    public String getDescription(){
        return essentialCoffee.getDescription();
    }

    @Override
    public double cost(){
        return essentialCoffee.cost();
    }
}