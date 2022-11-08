package com.samsung;

import com.samsung.model.Product;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product(
                "Сыр",
                50,
                10
        );
        Product product2 = new Product(
                "Хлеб",
                10,
                100
        );
        Product.changeCount(product1, -5);
        System.out.println(product1);
    }
}
