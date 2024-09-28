public class Topping implements Pizza{
    Pizza plainPizza;

    public Topping(Pizza plainPizza){
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
