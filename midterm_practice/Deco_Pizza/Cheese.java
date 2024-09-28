public class Cheese extends Topping{

    public Cheese (Pizza plainPizza){
        super(plainPizza);
    }

    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Cheese";
    }

    @Override
    public int cost(){
        return plainPizza.cost() + 20;
    }
}
