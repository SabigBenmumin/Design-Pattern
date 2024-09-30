public class HawaiianFactory extends PizzaFactory{
    @Override
    public Pizza make(){
        Pizza hawaiian = new ThinCrusPizza();
        hawaiian = new Pineapple(hawaiian);
        hawaiian = new Cheese(hawaiian);
        hawaiian = new Bacon(hawaiian);
        hawaiian = new Tomato(hawaiian);
        return hawaiian;
    }
}