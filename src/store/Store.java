package store;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Store implements StoreFunction {
    private int id;
    private String name;
    private String owner;
    private List<Product> products;
    private List<Integer> productsId;

    public Store(int id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.products = new ArrayList<>();
        this.productsId = new ArrayList<>();
    }


    @Override
    public void outputProduct() {
        products.forEach(System.out::println);
    }

    @Override
    public void addProduct(int id, String name, String category, int price, String maker, int count) {
        if (!productsId.contains(id)) {
            products.add(new Product(id, name, category, price, maker, count));
            productsId.add(id);
        }
    }
}
