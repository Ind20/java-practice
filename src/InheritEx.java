class Parent  {
    String brand;

    Parent(String brand) {
        this.brand = brand;
        System.out.println("parent class constructor called");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Child extends Parent {
    int numberOfDoors;

    Child(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
        System.out.println("child class constructor called");
    }

    void displayCarInfo() {
        System.out.println(brand + " Number of doors: " + numberOfDoors);
    }
}

public class InheritEx {
    public static void main(String[] args) {
        Child myCar = new Child("Toyota", 4);
        myCar.displayInfo();        // Calls the method from the parent class
        myCar.displayCarInfo();    // Calls the method from the child class
    }
}

