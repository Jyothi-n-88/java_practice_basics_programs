// Parent class
class Vehicle {
    String brand;

    // Parent constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called.");
    }
}

// Child class
class Car extends Vehicle {
    int doors;

    // Child constructor
    Car(String brand, int doors) {
        // Calls the parent class constructor
        super(brand); 
        this.doors = doors;
        System.out.println("Car constructor called.");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Doors: " + doors);
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.displayInfo();
    }
}
