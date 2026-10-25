public class Main {
    public static void main(String[] args) {

        CustomerOperations operations = new CustomerOperations();

        // 1. Displaying initial customers
        System.out.println("Initial Customer Details:");
        for (Customer customer : operations.getCustomers()) {
            System.out.println(customer);
        }

        // 2. Adding a new customer
        System.out.println("Adding New Customer:");
        boolean added = operations.addCustomer(
                6, "Seshu", "Reddy", 'M');

        System.out.println("Customer added: " + added);

        // 3. Attempting to add the same customer again
        System.out.println("\nAdding Duplicate Customer:");
        boolean duplicate = operations.addCustomer(
                6, "Seshu", "Reddy", 'M');

        System.out.println("Customer added: " + duplicate);

        // 4. Updating customer with ID 3
        System.out.println("Updating Customer ID 3:");
        boolean updated = operations.updateCustomer(
                3, "Ramesh", "Reddy", 'M');

        System.out.println("Customer updated: " + updated);

        // 5. Deleting customer with ID 4
        System.out.println("Deleting Customer ID 4:");
        boolean deleted = operations.deleteCustomer(4);

        System.out.println("Customer deleted: " + deleted);

        // 6. Finding customer with ID 2
        System.out.println("Searching Customer ID 2:");
        Customer customer1 = operations.findCustomerById(2);

        if (customer1 != null) {
            System.out.println(customer1);
        } else {
            System.out.println("Customer not found.");
        }

        // 7. Finding customer by first name Deepika
        System.out.println("Searching Customer by First Name Deepika:");
        Customer customer2 =
                operations.findCustomerByFirstname("Deepika");

        if (customer2 != null) {
            System.out.println(customer2);
        } else {
            System.out.println("Customer not found.");
        }

        // 8. Searching for a non-existing customer
        System.out.println("Searching Customer ID 9:");
        Customer customer3 = operations.findCustomerById(9);

        if (customer3 != null) {
            System.out.println(customer3);
        } else {
            System.out.println("Customer with ID 9 does not exist.");
        }

        // 9. Displaying all customers after operations
        System.out.println("Final Customer Details:");
        for (Customer customer : operations.getCustomers()) {
            System.out.println(customer);
        }
    }
}