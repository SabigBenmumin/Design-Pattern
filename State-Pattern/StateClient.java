import java.util.Scanner;

public class StateClient {

    public static int waitOrder(){
        Scanner scan = new Scanner(System.in);

        System.out.println("choose your order");
        System.out.println("Pizza Menu");
        System.out.println("\t[1] Hawaiian");
        System.out.println("\t[2] Seafood");
        System.out.println("Coffee Menu");
        System.out.println("\t[3] Americano");
        System.out.println("\t[4] Latte");
        System.out.print(">>>: ");
        String menuNum = scan.nextLine();
        int number = Integer.parseInt(menuNum);
        return number;
    }

    public static void produceProduct(int num){
        CoffeeFactory americanoFactory = new AmericanoFactory();
        CoffeeFactory latteFactory = new LatteFactory();
        PizzaFactory hawaiianFactory = new HawaiianFactory();
        PizzaFactory seafoodFactory = new SeafoodFactory();
        
        if (num == 1){
            hawaiianFactory.make();
        }
        else if (num == 2){
            seafoodFactory.make();
        }
        else if (num == 3){
            americanoFactory.make();
        }
        else{
            latteFactory.make();
        }

    }

    public static void main(String[] args) {
        while(true){
            int orderNo = waitOrder();
            if (orderNo < 1 || orderNo > 4){
                continue;
            }
            produceProduct(orderNo);
            System.out.println("\ncontinue?");
            System.out.println("press 1 next order");
            System.out.println("press other number for stop program");
            System.out.print(">>>: ");
            Scanner scan = new Scanner(System.in);
            int isContinue = scan.nextInt();
            if (isContinue == 1){
                System.out.println("");
            }
            else {
                System.out.print("Good bye~~~");
                break;
            }
        }
    }
}
