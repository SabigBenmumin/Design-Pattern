
import java.util.Scanner;




public class ReadyState implements State{
    // private void start(){
    //     Scanner scanja = new Scanner(System.in);
    //     String next = scanja.next();
    //     System.out.println("Enter for start...");

    // }

    @Override
    public void insertMoney(int amount) {
        throw new UnsupportedOperationException("Unimplemented method 'insertMoney'");
    }

    @Override
    public String selectProduct(String product) {
        System.out.println("Select product");
        System.out.println("Coke");
        System.out.println("Pepsi");
        System.out.println("Coffee");
    }

    @Override
    public void dispense() {
        throw new UnsupportedOperationException("Unimplemented method 'dispense'");
    }

    @Override
    public void refund() {
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }

}
