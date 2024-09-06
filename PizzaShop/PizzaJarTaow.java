//Name: Sabig Benmumin
//ID: 6510742197

public class PizzaJarTaow {
    public static void main(String[] args) {
        // System.out.println("What you want sir?");
        // System.out.println("Toping");
        // System.out.println("[a] Pizza dough 20 THB");
        // System.out.println("[b] Pineapple 5 THB");
        // System.out.println("[c] Cheese 8 THB");
        // System.out.println("[d] Ham 15 THB");
        // System.out.println("[e] Pepper 9 THB");
        // System.out.println("[f] Shrimp");
        // System.out.println("[g] Cheese 8 THB");
        // System.out.println("[h] Cheese 8 THB");
        // System.out.println("[s] submit your order");
        // System.out.println("choose your order");
        // System.out.println("input a or b for choose");
        // System.out.println("[a] Hawaiian");
        // System.out.println("[b] Seafood");
        // Scanner choose = new Scanner(System.in);
        // String choise = choose.nextLine();
        // System.out.println("Good choise, Good choise!!");
        Pizza hawaiian = new Plain();
        hawaiian = new Pineapple(hawaiian);
        hawaiian = new Cheese(hawaiian);
        hawaiian = new Ham(hawaiian);
        hawaiian = new Tomato(hawaiian);
        System.out.println(hawaiian.getDescription() + "\ntotal = " + hawaiian.cost() + " ฿");

        Pizza seafood = new Plain();
        seafood = new Cheese(seafood);
        seafood = new Pepper(seafood);
        seafood = new Shrimp(seafood);
        seafood = new Mussels(seafood);
        seafood = new Tomato(seafood);
        System.out.println(seafood.getDescription() + "\ntotal = " + seafood.cost() + " ฿");
    }
}
