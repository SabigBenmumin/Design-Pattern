public class Sausage extends PTopping{

    public Sausage (Pizza plainPizza){
        super(plainPizza);
    }

    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Sausage";
    }

    @Override
    public int cost(){
        return plainPizza.cost() + 30;
    }
}
