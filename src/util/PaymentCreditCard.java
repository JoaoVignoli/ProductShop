package util;

public class PaymentCreditCard implements IPaymentMethod{

    @Override
    public Boolean pay(Double value) {

        if (value < 1000) {
            return false;
        } 
        
        return true;
    }
}
