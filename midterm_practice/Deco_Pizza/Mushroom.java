public class Mushroom extends Topping{
    public Mushroom(Pizza plainPizza){
        super(plainPizza);
    }

    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Mushroom";
    }

    @Override
    public int cost(){
        return plainPizza.cost() + 15;
    }
}