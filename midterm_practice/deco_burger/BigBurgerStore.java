public class BigBurgerStore {
    public static void main(String[] argm){
        Burger myBur = new BasicBurger();
        myBur = new Cheese(myBur);
        myBur = new Bacon(myBur);
        System.out.println(myBur.getDescription());
        System.out.println("Total " + myBur.getCost() + " Baht");
    }
}
