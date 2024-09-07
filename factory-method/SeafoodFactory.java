public class SeafoodFactory extends PizzaFactory{

    @Override
    public Pizza make() {
        Pizza seafood = new Plain();
        seafood = new Cheese(seafood);
        seafood = new Pepper(seafood);
        seafood = new Shrimp(seafood);
        seafood = new Mussels(seafood);
        seafood = new Tomato(seafood);
        System.out.println(seafood.getDescription() + ": " + seafood.cost() + " THB");
        return null;
    }

}