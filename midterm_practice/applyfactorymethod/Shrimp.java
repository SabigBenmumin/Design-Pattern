public class Shrimp extends PTopping{

    public Shrimp(Pizza plainPizza) {
        super(plainPizza);
    }
    @Override
    public int cost(){
        return plainPizza.cost() + 7;
    }
    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Shrimp";
    }
}
