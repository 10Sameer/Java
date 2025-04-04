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

