public class JartaowCoffee {
    public static void main(String[] args){
        Coffee americano = new Espresso();
        americano = new HotWaver(americano);
        System.out.println("americano: " + americano.cost() + " THB");

        Coffee latte = new Espresso();
        latte = new Milk(latte);
        System.out.println("Coffe latt: " + latte.cost() + " THB");
    }
}
