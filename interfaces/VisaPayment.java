package interfaces;

public class VisaPayment implements PaymentProcessor{
    @Override
    public void pay(double amount){
        System.out.println("Paid tsh" + amount + "using visa payment");
    }
    
}
