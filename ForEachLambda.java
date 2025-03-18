import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ForEachLambda {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.00));
        products.add(new Product("Phone", 800.00));
        products.add(new Product("Tablet", 600.00));

        // Using forEach with Lambda
        products.forEach(product -> 
            System.out.println("Product: " + product.name + ", Price: $" + product.price)
        );
    }
}
