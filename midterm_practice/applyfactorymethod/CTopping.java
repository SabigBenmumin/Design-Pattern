public abstract class CTopping implements Coffee{
    Coffee essentialCoffee;

    public CTopping(Coffee essentialCOffee){
        this.essentialCoffee = essentialCOffee;
    }
    
    @Override
    public int cost(){
        return essentialCoffee.cost();
    }
}
