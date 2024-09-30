public class ThinCrusPizza implements Pizza{

    @Override
    public String getDescription(){
        return "Thin Crust Pizza";
    }

    @Override
    public int cost(){
        return 150;
    }
}
