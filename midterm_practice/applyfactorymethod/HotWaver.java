public class HotWaver extends CTopping{
    public HotWaver(Coffee essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public String getDescription() {
        return essentialCoffee.getDescription() + " + HotWaver";
    }

    @Override
    public int cost(){
        return essentialCoffee.cost() + 3;
    }

}