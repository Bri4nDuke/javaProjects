// By Brian Duke
// Stores Person and Customer data inputed by the user

// Customer class definition
public class Customer extends Person {
    private int customerNumber;
    private boolean mailingListFlag;

    // Constructor
    public Customer(String name, String streetAddress, String city, String stateCode, int zipCode, int customerNumber, boolean mailingListFlag) {
        super(name, streetAddress, city, stateCode, zipCode);
        this.customerNumber = customerNumber;
        this.mailingListFlag = mailingListFlag;
    }

    // Accessor methods
    public int getCustomerNumber() {
        return customerNumber;
    }

    // boolean for Mailing List Flag
    public boolean getMailingListFlag() {
        return mailingListFlag;
    }

    // Mutator methods
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setMailingListFlag(boolean mailingListFlag) {
        this.mailingListFlag = mailingListFlag;
    }
}
