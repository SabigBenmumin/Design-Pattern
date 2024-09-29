public class Egg extends Topping{
    public Egg(Burger baseBurger){
        super(baseBurger);
    }

    @Override
    public String getDescription(){
        return baseBurger.getDescription() + " + Egg";
    }
    @Override
    public double getCost(){
        return baseBurger.getCost() + 15;
    }
}
