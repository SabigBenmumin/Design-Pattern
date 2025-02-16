public class Topping extends Pizza{
    Pizza plainPizza;

    public Topping(Pizza plainPizza){
        this.plainPizza = plainPizza;
    }
    @Override
    public int cost(){
        return plainPizza.cost();
    }

    @Override
    void prepare() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepare'");
    }
}
