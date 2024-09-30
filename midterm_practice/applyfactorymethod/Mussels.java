public class Mussels extends PTopping{
    public Mussels (Pizza plainPizza){
        super(plainPizza);
    }
    @Override
    public int cost(){
        return plainPizza.cost() + 4;
    }
    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Mussels";
    }
    
}