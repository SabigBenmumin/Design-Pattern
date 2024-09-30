public class Pineapple extends PTopping{
    public Pineapple(Pizza plainPizza){
        super(plainPizza);
    }
    @Override
    public int cost(){
        return plainPizza.cost() + 5;
    }
    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Pineapple";
    }
}
