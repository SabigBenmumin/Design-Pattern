public class ExtraSauce extends PTopping{
    public ExtraSauce(Pizza plainPizza){
        super(plainPizza);
    }

    @Override
    public String getDescription(){
        return plainPizza.getDescription() + " + Extra Sauce";
    }

    @Override
    public int cost(){
        return plainPizza.cost() + 10;
    }
}
