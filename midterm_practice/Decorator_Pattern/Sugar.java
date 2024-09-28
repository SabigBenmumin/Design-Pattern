public class Sugar extends Topping{

    public Sugar(Beverage essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public int cost(){
        return essentialCoffee.cost() + 5;
    }
}
