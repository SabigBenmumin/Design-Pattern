public abstract class Topping implements Beverage{
    Beverage essentialCoffee;

    public Topping(Beverage essentialCOffee){
        this.essentialCoffee = essentialCOffee;
    }
    
    @Override
    public int cost(){
        return essentialCoffee.cost();
    }
}
