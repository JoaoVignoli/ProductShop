package util;

public class Shop {
    IPaymentMethod paymentMethod;

    public Shop(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(Cart cart) {

        Double paymentValue = cart.calculateTotal();
        boolean paymentSuccessfully = paymentMethod.pay(paymentValue);

        if (!paymentSuccessfully) {
            System.out.println("Pagamento reprovado!");
            return;
        }

        System.out.println("Pagamento realizado com sucesso!");
    }
}
