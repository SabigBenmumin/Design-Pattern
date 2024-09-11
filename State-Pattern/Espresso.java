public class Espresso implements Coffee {

    @Override
    public String getDescription(){
        return "Cafae ma laew kubb";
    }
    
    @Override
    public double cost() {
        return 10;
    }
}