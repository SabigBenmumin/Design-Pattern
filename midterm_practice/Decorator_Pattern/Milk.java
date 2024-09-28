public class Milk extends Topping{

    public Milk(Beverage essentialCoffee){
        super(essentialCoffee);
    }

    @Override
    public int cost(){
        return essentialCoffee.cost() + 10;
    }
}
