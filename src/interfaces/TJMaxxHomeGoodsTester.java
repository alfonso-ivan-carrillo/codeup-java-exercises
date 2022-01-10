package interfaces;

public class TJMaxxHomeGoodsTester {
    public static void main(String[] args) {

        Customer janet = new Customer(68.75);
        janet.activity();
        System.out.println(janet.getWallet());

        Employee marcus = new Employee();
        marcus.activity();

    }
}
