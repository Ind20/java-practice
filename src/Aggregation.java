class Address {
    private final String street;
    private final String city;
    private final String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getAddressDetails() {
        return street + ", " + city + ", " + state;
    }
}

class Person {
    private final String name;
    private final Address address; // Aggregation

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getAddressDetails());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Cityville", "Stateville");
        Person person = new Person("John Doe", address);

        person.displayPersonInfo();
    }
}
