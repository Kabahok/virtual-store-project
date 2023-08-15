package store;

import product.Product;
import storageArea.StorageArea;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id;
    private String name;
    private String owner;
    private List<Product> products;
    private StorageArea storageArea;

    public Store(int id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.storageArea = new StorageArea();
    }

    public void outputProduct() {
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

}
