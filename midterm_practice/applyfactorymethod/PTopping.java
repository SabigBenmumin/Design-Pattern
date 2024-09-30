public class PTopping implements Pizza{
    Pizza plainPizza;

    public PTopping(Pizza plainPizza){
        this.plainPizza = plainPizza;
    }

    @Override
    public String getDescription(){
        return plainPizza.getDescription();
    }

    @Override
    public int cost(){
        return plainPizza.cost();
    }
}
