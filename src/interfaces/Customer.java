package interfaces;

// an INTERFACE does not Extend but IMPLEMENTS - as noted as below -
// you can implement more than when INTEFACE, they would just be seperated by a comma, -> implements Person, 2ndInterface{
public class Customer implements Person{
    public double wallet;

    public Customer(double wallet){
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void activity(){
        System.out.println("Just browsin' around. Don't mind me.");
    }
}
