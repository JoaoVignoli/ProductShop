package util;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<Product>();
    private Double totalPrice;

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double calculateTotal() {

        for (Product product : products) {
            totalPrice =+ product.getPrice();
        }
        
        return totalPrice;
    }
}
