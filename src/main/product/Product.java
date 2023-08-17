package main.product;

public class Product {
    private int id;
    private String name;
    private String category;
    private int price;
    private String maker;
    private int count;

    public Product(int id, String name, String category, int price, String maker, int count) {
        this.id = id;
        this.name= name;
        this.category = category;
        this.price = price;
        this.maker = maker;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nНазвание товара: %s\nЦена: %d\nПроизводитель: %s\nДоступно для покупки: %d\n",
                id, name, price, maker, count);
    }

    public int getId() {
        return id;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public int getCount() {
        return count;
    }
}
