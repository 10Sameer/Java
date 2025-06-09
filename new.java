interface Flyable {
    void fly();

    default void navigate() {
        System.out.println("Navigating in the air.");
    }
}

