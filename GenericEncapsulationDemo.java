// Generic class with encapsulation
class DataHolder<T> {
    private T data; // Private variable

    // Constructor
    public DataHolder(T data) {
        this.data = data;
    }

    // Getter method
    public T getData() {
        return data;
    }

    // Setter method
    public void setData(T data) {
        this.data = data;
    }
}

// Main class to demonstrate generic encapsulation
public class GenericEncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object for Integer type
        DataHolder<Integer> intHolder = new DataHolder<>(100);
        System.out.println("Integer Value: " + intHolder.getData());

        // Updating the value
        intHolder.setData(200);
        System.out.println("Updated Integer Value: " + intHolder.getData());

        // Creating an object for String type
        DataHolder<String> stringHolder = new DataHolder<>("Hello, Generics!");
        System.out.println("String Value: " + stringHolder.getData());

        // Updating the value
        stringHolder.setData("Updated String");
        System.out.println("Updated String Value: " + stringHolder.getData());
    }
}
