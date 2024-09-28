public class BigBaresta {
    public static void main(String[] argm){
        Beverage myCof = new Espresso();
        myCof = new Milk(myCof);
        myCof = new Sugar(myCof);
        System.out.println(myCof.cost());
    }
}
