public class Sugar extends CTopping{

    public Sugar(Coffee essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public int cost(){
        return essentialCoffee.cost() + 5;
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
