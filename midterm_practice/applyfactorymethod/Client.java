public class Client {
    public static void main(String[] args) {
        CoffeeFactory americanoFactory = new AmericanoFactory();
        CoffeeFactory lattFactory = new LatteFactory();
        PizzaFactory hawaiianFactory = new HawaiianFactory();
        PizzaFactory seafoodFactory = new SeafoodFactory();

        Coffee ameri = americanoFactory.make();
        Coffee latte = lattFactory.make();
        Pizza hawaiian = hawaiianFactory.make();
        Pizza seafood = seafoodFactory.make();

        System.out.println(ameri.cost());
        System.out.println(ameri.getDescription());
        System.out.println(latte.cost());
        System.out.println(latte.getDescription());
        System.out.println(hawaiian.cost());
        System.out.println(hawaiian.getDescription());
        System.err.println(seafood.cost());
        System.err.println(seafood.getDescription());
    }
}
