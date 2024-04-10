// By Brian Duke
// Stores Person and Customer data inputed by the user

// Person class definition for what User will input
public class Person {
    private String name;
    private String streetAddress;
    private String city;
    private String stateCode;
    private int zipCode;

    // Constructors for what User will input
    public Person(String name, String streetAddress, String city, String stateCode, int zipCode) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.stateCode = stateCode;
        this.zipCode = zipCode;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
