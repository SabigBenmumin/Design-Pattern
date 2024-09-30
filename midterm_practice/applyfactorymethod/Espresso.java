public class Espresso implements Coffee{
    @Override
    public int cost(){
        return 50;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
