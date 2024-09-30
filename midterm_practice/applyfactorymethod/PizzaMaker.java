public class PizzaMaker {
    public static void main(String[] argm){
        Pizza myPiz = new ThinCrusPizza();
        myPiz = new Cheese(myPiz);
        myPiz = new Sausage(myPiz);
        System.out.println(myPiz.getDescription());
        System.out.println(myPiz.cost());
    }
}
