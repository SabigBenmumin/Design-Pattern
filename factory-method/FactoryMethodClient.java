public class FactoryMethodClient {
    public static void main(String[] args) {
        CoffeeFactory americanoFactory = new AmericanoFactory();
        CoffeeFactory latteFactory = new LatteFactory();
        PizzaFactory hawaiianFactory = new HawaiianFactory();
        PizzaFactory seafoodFactory = new SeafoodFactory();

        americanoFactory.make();
        latteFactory.make();
        hawaiianFactory.make();
        seafoodFactory.make();
    }
}
