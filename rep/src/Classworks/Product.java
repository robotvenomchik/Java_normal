package Classworks;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private String category;
    private boolean available;

    public Product(String name, double price, String category, boolean available) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Classworks.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", available=" + available +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Телевизор", 999.99, "Электроника", true));
        products.add(new Product("Ноутбук", 1499.99, "Электроника", false));
        products.add(new Product("Футболка", 19.99, "Одежда", true));
        products.add(new Product("Джинсы", 39.99, "Одежда", true));
        products.add(new Product("Мышь", 14.99, "Электроника", false));
        products.add(new Product("Клавиатура", 29.99, "Электроника", true));
        products.add(new Product("Часы", 79.99, "Аксессуары", true));
        products.add(new Product("Кофеварка", 49.99, "Бытовая техника", false));
        products.add(new Product("Книга", 9.99, "Книги", true));
        products.add(new Product("Шапка", 12.99, "Одежда", true));



        double sum = products.stream().filter(elem-> elem.getPrice() < 80).mapToDouble(Product::getPrice).sum();
        System.out.println(sum);
    }
}
