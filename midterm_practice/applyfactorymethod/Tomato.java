public class Tomato extends PTopping{
    public Tomato(Pizza plainPizza){
        super(plainPizza);
    }
    @Override
    public int cost(){
        return plainPizza.cost() + 3;
    }
    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Tomato";
    }
}
