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

    @Override
    public void sail() {
        System.out.println("Sailing in the ocean.");
    }

    // Must override navigate() to resolve conflict
    @Override
    public void navigate() {
        System.out.println("Custom navigation for amphibious vehicle.");
        Flyable.super.navigate(); // Optional: call specific interface version
        Sailable.super.navigate(); // Optional: call specific interface version
    }
}

