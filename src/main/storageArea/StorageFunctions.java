package main.storageArea;

import main.product.Product;

import java.util.List;

public interface StorageFunctions {
    List<Product> getProducts();
    void addProduct(List<Product> products);
}
