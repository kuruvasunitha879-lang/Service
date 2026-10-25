import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {

    private HashSet<Customer> customers = new HashSet<>();


    public CustomerOperations() {
        customers.add(new Customer(1, "sai", "Karthik", 'M'));
        customers.add(new Customer(2, "Deepika", "Reddy", 'F'));
        customers.add(new Customer(3, "Ramesh", "Reddy", 'M'));
        customers.add(new Customer(4, "Naga", "Lakshmi", 'F'));
        customers.add(new Customer(5, "sai", "Kiran", 'M'));
    }

    //Adding customer
    public boolean addCustomer(int id, String firstname,
                               String lastname, char gender) {

        Customer customer =
                new Customer(id, firstname, lastname, gender);

        return customers.add(customer);
    }

    //Updating customer
    public boolean updateCustomer(int customerId, String firstname,
                                  String lastname, char gender) {

        Customer customer = findCustomerById(customerId);

        if (customer != null) {

            customers.remove(customer);

            customer.setFirstname(firstname);
            customer.setLastname(lastname);
            customer.setGender(gender);

            customers.add(customer);
            return true;
        }

        return false;
    }

    //Deleting customer
    public boolean deleteCustomer(int customerId) {

        Iterator<Customer> iterator = customers.iterator();

        while (iterator.hasNext()) {
            Customer customer = iterator.next();

            if (customer.getId() == customerId) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    // Retrieving all customers
    public HashSet<Customer> getCustomers() {
        return customers;
    }

    // Finding customer by ID
    public Customer findCustomerById(int customerId) {

        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }

        return null;
    }


    public Customer findCustomerByFirstname(String firstname) {

        for (Customer customer : customers) {
            if (customer.getFirstname().equalsIgnoreCase(firstname)) {
                return customer;
            }
        }

        return null;
    }


}