public class AmericanoFactory extends CoffeeFactory{

    @Override
    public Coffee make() {
        Coffee americano = new Espresso();
        americano = new HotWaver(americano);
        System.out.println("americano: " + americano.cost() + " THB");
        return null;
    }
}
