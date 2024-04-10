// By Brian Duke
// Stores Person and Customer data inputed by the user

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // User input customer information below
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer Data Input Program\n");
        

        System.out.println("Please enter person's name below: ");
        String name = scanner.nextLine();

        System.out.println("Please enter person's street address below: ");
        String streetAddress = scanner.nextLine();

        System.out.println("Please enter person's city below: ");
        String city = scanner.nextLine();

        System.out.println("Please enter person's state code below: ");
        String stateCode = scanner.nextLine();

        System.out.println("Please enter person's zip code below: ");
        int zipCode = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter customer number below: ");
        int customerNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Is this customer on the mailing list? (Answer true or false below): ");
        boolean mailingListFlag = scanner.nextBoolean();
        scanner.close();

        Customer customer = new Customer(name, streetAddress, city, stateCode, zipCode, customerNumber, mailingListFlag);

        // Print customer info
        System.out.println("\nCustomer Data You Have Entered:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Street Address: " + customer.getStreetAddress());
        System.out.println("City: " + customer.getCity());
        System.out.println("State Code: " + customer.getStateCode());
        System.out.println("Zip Code: " + customer.getZipCode());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("Mailing List: " + (customer.getMailingListFlag() ? "Yes" : "No"));
    }
}
