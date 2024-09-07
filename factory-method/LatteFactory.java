public class LatteFactory extends CoffeeFactory{

    @Override
    public  Coffee make() {
        Coffee latte = new Espresso();
        latte = new Milk(latte);
        System.out.println("latte: " + latte.cost() + " THB");
        return null;
    }
}