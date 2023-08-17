package main.storageArea;

import main.checkingSystem.CheckingProducts;
import main.product.Product;

import java.util.ArrayList;
import java.util.List;

public class StorageArea implements StorageFunctions {
    private List<Product> products;
    private List<Integer> productsId;

    public StorageArea() {
        products = new ArrayList<>();
        productsId = new ArrayList<>();
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(List<Product> products) {
        for (Product product: products) {
            CheckingProducts.repeateCheck(this.products, productsId, product);
        }
    }


}
