import java.util.*;

class Vehicle {
    String number;

    Vehicle(String number) {
        this.number = number;
    }
}

class twoWheeler extends Vehicle {

    twoWheeler(String number) {
        super(number);
    }

    void park() {

        // Check if vehicle is already parked
        if (parkingproblem.isAlreadyParked(number)) {
            System.out.println("Vehicle " + number + " is already parked.");
            return;
        }

        // Find empty slot
        for (int i = 0; i < parkingproblem.two.length; i++) {

            if (parkingproblem.two[i] == null) {
                parkingproblem.two[i] = this;

                System.out.println(
                    "2-Wheeler parked at slot " + (i + 1)
                );

                return;
            }
        }

        System.out.println("No 2-wheeler slot available.");
    }

    void remove() {

        for (int i = 0; i < parkingproblem.two.length; i++) {

            if (parkingproblem.two[i] != null &&
                parkingproblem.two[i].number.equals(this.number)) {

                parkingproblem.two[i] = null;

                System.out.println(
                    "2-Wheeler removed from slot " + (i + 1)
                );

                return;
            }
        }

        System.out.println("Vehicle is not parked.");
    }

    void display() {

        System.out.print("Available 2-wheeler slots: ");

        for (int i = 0; i < parkingproblem.two.length; i++) {

            if (parkingproblem.two[i] == null) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }
}

class fourWheeler extends Vehicle {

    fourWheeler(String number) {
        super(number);
    }

    void park() {

        // Check if vehicle is already parked
        if (parkingproblem.isAlreadyParked(number)) {
            System.out.println("Vehicle " + number + " is already parked.");
            return;
        }

        // Find empty slot
        for (int i = 0; i < parkingproblem.four.length; i++) {

            if (parkingproblem.four[i] == null) {
                parkingproblem.four[i] = this;

                System.out.println(
                    "4-Wheeler parked at slot " + (i + 1)
                );

                return;
            }
        }

        System.out.println("No 4-wheeler slot available.");
    }

    void remove() {

        for (int i = 0; i < parkingproblem.four.length; i++) {

            if (parkingproblem.four[i] != null &&
                parkingproblem.four[i].number.equals(this.number)) {

                parkingproblem.four[i] = null;

                System.out.println(
                    "4-Wheeler removed from slot " + (i + 1)
                );

                return;
            }
        }

        System.out.println("Vehicle is not parked.");
    }

    void display() {

        System.out.print("Available 4-wheeler slots: ");

        for (int i = 0; i < parkingproblem.four.length; i++) {

            if (parkingproblem.four[i] == null) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }
}

class morethanfourWheel extends Vehicle {

    morethanfourWheel(String number) {
        super(number);
    }

    void park() {

        // Check if vehicle is already parked
        if (parkingproblem.isAlreadyParked(number)) {
            System.out.println("Vehicle " + number + " is already parked.");
            return;
        }

        // Find empty slot
        for (int i = 0; i < parkingproblem.more.length; i++) {

            if (parkingproblem.more[i] == null) {
                parkingproblem.more[i] = this;

                System.out.println(
                    "More than 4-wheeler parked at slot " + (i + 1)
                );

                return;
            }
        }

        System.out.println("No slot available.");
    }

    void remove() {

        for (int i = 0; i < parkingproblem.more.length; i++) {

            if (parkingproblem.more[i] != null &&
                parkingproblem.more[i].number.equals(this.number)) {

                parkingproblem.more[i] = null;

                System.out.println(
                    "Vehicle removed from slot " + (i + 1)
                );

                return;
            }
        }

        System.out.println("Vehicle is not parked.");
    }

    void display() {

        System.out.print(
            "Available slots for more than 4-wheelers: "
        );

        for (int i = 0; i < parkingproblem.more.length; i++) {

            if (parkingproblem.more[i] == null) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }
}

public class parkingproblem {

    static Vehicle[] two = new Vehicle[5];
    static Vehicle[] four = new Vehicle[5];
    static Vehicle[] more = new Vehicle[5];

    // Check whether vehicle number already exists
    static boolean isAlreadyParked(String number) {

        // Check 2-wheelers
        for (int i = 0; i < two.length; i++) {

            if (two[i] != null &&
                two[i].number.equals(number)) {

                return true;
            }
        }

        // Check 4-wheelers
        for (int i = 0; i < four.length; i++) {

            if (four[i] != null &&
                four[i].number.equals(number)) {

                return true;
            }
        }

        // Check more than 4-wheelers
        for (int i = 0; i < more.length; i++) {

            if (more[i] != null &&
                more[i].number.equals(number)) {

                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Available Slots");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            // EXIT
            if (choice == 4) {

                System.out.println("Thank you!");
                break;
            }

            // PARK
            else if (choice == 1) {

                System.out.print("Enter vehicle number: ");
                String number = sc.next();

                System.out.print("Enter vehicle type (2/4/more): ");
                String type = sc.next();

                Vehicle v;

                if (type.equals("2")) {
                    v = new twoWheeler(number);
                }
                else if (type.equals("4")) {
                    v = new fourWheeler(number);
                }
                else {
                    v = new morethanfourWheel(number);
                }

                if (v instanceof twoWheeler) {
                    ((twoWheeler) v).park();
                }
                else if (v instanceof fourWheeler) {
                    ((fourWheeler) v).park();
                }
                else {
                    ((morethanfourWheel) v).park();
                }
            }

            // REMOVE
            else if (choice == 2) {

                System.out.print("Enter vehicle number: ");
                String number = sc.next();

                System.out.print("Enter vehicle type (2/4/more): ");
                String type = sc.next();

                Vehicle v;

                if (type.equals("2")) {
                    v = new twoWheeler(number);
                }
                else if (type.equals("4")) {
                    v = new fourWheeler(number);
                }
                else {
                    v = new morethanfourWheel(number);
                }

                if (v instanceof twoWheeler) {
                    ((twoWheeler) v).remove();
                }
                else if (v instanceof fourWheeler) {
                    ((fourWheeler) v).remove();
                }
                else {
                    ((morethanfourWheel) v).remove();
                }
            }

            // DISPLAY
            else if (choice == 3) {

                System.out.print(
                    "Enter vehicle type (2/4/more): "
                );

                String type = sc.next();

                if (type.equals("2")) {

                    twoWheeler v = new twoWheeler("");
                    v.display();

                }
                else if (type.equals("4")) {

                    fourWheeler v = new fourWheeler("");
                    v.display();

                }
                else {

                    morethanfourWheel v =
                        new morethanfourWheel("");

                    v.display();
                }
            }

            else {

                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}