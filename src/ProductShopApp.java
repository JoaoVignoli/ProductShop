import util.*;

public class ProductShopApp {
    public static void main(String[] args) {
       
        Cart userCart = new Cart();
        IPaymentMethod paymentMethod = new PaymentPix();
        Shop shop = new Shop(paymentMethod);

        Product p1 = new Product("Camiseta Verde", 85.45);
        Product p2 = new Product("Camiseta Preta", 34.56);

        userCart.addProduct(p1);
        userCart.addProduct(p2);

        shop.makePayment(userCart);
    }
}
