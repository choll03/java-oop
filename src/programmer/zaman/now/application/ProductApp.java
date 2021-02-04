package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class ProductApp {

    public static void main(String[] args) {

        Product product = new Product("Loyang bulat", 3000);

        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);
    }
}
