import store.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(1, "Ашан", "Армен");

        store.addProduct(1, "Хлеб", "Выпечка", 20, "Дружба", 100);
        store.addProduct(2, "Молоко", "Молочная", 40, "Дружба", 150);

        store.outputProduct();
    }
}
