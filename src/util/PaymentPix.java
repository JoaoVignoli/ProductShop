package util;

import java.util.concurrent.TimeUnit;

public class PaymentPix implements IPaymentMethod{

    @Override
    public Boolean pay(Double value) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

}
