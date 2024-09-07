public class HotWaver extends Element{
    public HotWaver(Coffee essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public String getDescription(){
        return essentialCoffee.getDescription() + " + hot waver";
    }

    @Override
    public double cost(){
        return essentialCoffee.cost() + 3;
    }
}
