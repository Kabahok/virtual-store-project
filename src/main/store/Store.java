package main.store;

import main.OutputProducts;
import main.basket.AddingProduct;
import main.basket.Basket;
import main.product.Product;
import main.storageArea.StorageArea;

import java.util.List;

public class Store implements OutputProducts, AddingProduct {
    private int id;
    private String name;
    private String owner;
    private List<Product> products;
    private StorageArea storageArea;
    private Basket basket;

    public Store(int id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.storageArea = new StorageArea();
        this.basket = new Basket();
    }

    @Override
    public void outputProducts() {
        getProductsFromStorageArea();
        products.forEach(System.out::println);
    }

    private void getProductsFromStorageArea() {
        products = storageArea.getProducts();
    }

    public StorageArea getStorageArea() {
        return storageArea;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void addProduct(List<Product> products) {
        basket.addProduct(products);
    }
}
