public abstract class Topping implements Burger{
    public Burger baseBurger;
   
    public Topping(Burger baseBurger) {
        this.baseBurger = baseBurger;
    }

    @Override
    public String getDescription(){
        return baseBurger.getDescription();
    }
    @Override
    public double getCost(){
        return  baseBurger.getCost();
    }
    
}
