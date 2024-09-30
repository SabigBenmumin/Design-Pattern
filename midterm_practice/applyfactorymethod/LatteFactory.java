public class LatteFactory extends CoffeeFactory{
    @Override
    public Coffee make(){
        Coffee latte = new Espresso();
        latte = new Milk(latte);
        return latte;
    }
}
