public class HawaiianFactory extends PizzaFactory{

    @Override
    public Pizza make() {
        Pizza hawaiian = new Plain();
        hawaiian = new Pineapple(hawaiian);
        hawaiian = new Cheese(hawaiian);
        hawaiian = new Ham(hawaiian);
        hawaiian = new Tomato(hawaiian);
        System.out.println(hawaiian.getDescription() + ": " + hawaiian.cost() + " THB");
        return null;
    }
}