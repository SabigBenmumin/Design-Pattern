public class SeafoodFactory extends PizzaFactory{
    @Override
    public Pizza make(){
        Pizza seafood = new ThinCrusPizza();
        seafood = new Cheese(seafood);
        seafood = new Shrimp(seafood);
        seafood = new Mussels(seafood);
        seafood = new Tomato(seafood);
        return seafood;
    }
}
