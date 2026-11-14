class Address {
    String city;

    // Parameterized constructor
    public Address(String city) {
        this.city = city;
    }
}

class Employee {
    String name;
    Address address;

    // Parameterized constructor
    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 1. Shallow Copy Constructor (booleans/flags can toggle, or use two constructors)
    public Employee(Employee other, boolean isDeepCopy) {
        this.name = other.name;

        if (isDeepCopy) {
            // Deep Copy: creates a new Address object with the same city value
            this.address = new Address(other.address.city);
        } else {
            // Shallow Copy: copies the reference of the existing Address object
            this.address = other.address;
        }
    }
}

public class constructors {
    public static void main(String[] args) {
        Address addr = new Address("Delhi");
        Employee emp1 = new Employee("Ravi", addr);

        // Shallow Copy using constructor
        Employee shallowEmp = new Employee(emp1, false);

        // Deep Copy using constructor
        Employee deepEmp = new Employee(emp1, true);

        // Modify the city name through shallowEmp
        shallowEmp.address.city = "Mumbai";

        System.out.println("Original Employee City: " + shallowEmp.address.city);          // Outputs "Mumbai" (affected by shallow copy)
        System.out.println("Deep Copy Employee City: " + deepEmp.address.city);    // Outputs "Delhi" (independent)
    }
}
