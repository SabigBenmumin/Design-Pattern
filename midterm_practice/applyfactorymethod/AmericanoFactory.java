public class AmericanoFactory extends CoffeeFactory {
    @Override
    public Coffee make(){
        Coffee americano = new Espresso();
        americano = new HotWaver(americano);
        return americano; 
    }
}