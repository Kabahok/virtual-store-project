package main.productsDelivery;

import main.product.Product;
import main.storageArea.StorageArea;

import java.util.List;

public class DeliveryOfProduct {
    private List<Product> products;
    private StorageArea storageArea;

    public DeliveryOfProduct(List<Product> products, StorageArea storageArea) {
        this.products = products;
        this.storageArea = storageArea;
    }

    public void deliverProducts() {
        storageArea.addProduct(products);
    }
}
