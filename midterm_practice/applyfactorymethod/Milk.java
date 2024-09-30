public class Milk extends CTopping{

    public Milk(Coffee essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public int cost(){
        return essentialCoffee.cost() + 10;
    }

    @Override
    public String getDescription() {
        return essentialCoffee.getDescription() + " + Milk";
    }
}
