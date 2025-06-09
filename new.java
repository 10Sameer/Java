interface Flyable {
    void fly();

    default void navigate() {
        System.out.println("Navigating in the air.");
    }
}

interface Sailable {
    void sail();

    default void navigate() {
        System.out.println("Navigating in the water.");
    }
}

// Class implementing both interfaces
class AmphibiousVehicle implements Flyable, Sailable {
    @Override
    public void fly() {
        System.out.println("Flying in the sky.");
    }
