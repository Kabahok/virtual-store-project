import deliveryOfProduct.DeliveryOfProduct;
import product.Product;
import store.Store;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(1, "Ашан", "Армен");

        DeliveryOfProduct deliveryOfProduct = new DeliveryOfProduct(Arrays.asList(
                new Product(1, "Хлеб", "Выпечка", 20, "Дружба", 100),
                new Product(2, "Молоко", "Молочная", 40, "Дружба", 150)
        ), store.getStorageArea());

        deliveryOfProduct.deliverProducts();

        store.outputProduct();
    }
}
