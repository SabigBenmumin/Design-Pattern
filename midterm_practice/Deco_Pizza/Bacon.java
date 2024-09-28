public class Bacon extends Topping{
    public Bacon(Pizza plainPizza){
        super(plainPizza);
    }

    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Bacon";
    }

    @Override
    public int cost(){
        return plainPizza.cost() +  40;
    }
}
