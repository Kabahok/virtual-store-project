package main.basket;

import main.OutputProducts;
import main.checkingSystem.CheckingProducts;
import main.product.Product;

import java.util.ArrayList;
import java.util.List;


public class Basket implements AddingProduct, OutputProducts {
    private List<Product> products;
    private List<Integer> productsId;


    public Basket() {
        products = new ArrayList<>();
        productsId = new ArrayList<>();
    }

    @Override
    public void addProduct(List<Product> products) {
        for (Product product : products) {
            CheckingProducts.repeateCheck(this.products, productsId, product);
        }

        outputProducts();
    }

    @Override
    public void outputProducts() {
        products.forEach(System.out::println);
    }
}
