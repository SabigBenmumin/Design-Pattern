public class Milk extends Element{
    public Milk(Coffee essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public String getDescription(){
        return essentialCoffee.getDescription() + " + milk";
    }

    @Override
    public double cost(){
        return essentialCoffee.cost() + 5;
    }
}