package store;

public interface StoreFunction {
    void outputProduct();
    void addProduct(int id, String name, String category, int price, String maker, int count);
}
