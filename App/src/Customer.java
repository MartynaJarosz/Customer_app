import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Customer {

    static Scanner scanner = new Scanner( System.in );
    static List<Customer> customers = new ArrayList<>();
    
    private String name;
    private String address;
    private String VAT_id;
    private Date creation_date;


    public Customer() {
        this.name = "null";
        this.VAT_id = "null";
        this.creation_date = null;
        this.address = "null";
    }

    public Customer( String name, String vat_id, Date creation_date, String address ) {
        this.name = name;
        this.VAT_id = vat_id;
        this.creation_date = creation_date;
        this.address = address;
    }
    
    public void add_customer() {

        System.out.println("Customer's name: ");
        String n = scanner.nextLine();
        
        System.out.println("VAT identification number: ");
        String vat = scanner.nextLine();
        
        System.out.println("Customer's address: ");
        String addr = scanner.nextLine();

        Date cr_date = new Date();
        
        Customer customer = new Customer(n, vat, cr_date, addr);
        customers.add(customer);
        
        System.out.println("\nNew customer added.\n");
    }
    

    public static void edit_customer() {
        
        System.out.println("Customer's name:");
        String name = scanner.nextLine();
        
        Customer customer = find_customer(name, customers);
        
        if ( customer == null ) {
            System.out.println("\nCustomer not found\n");
            return;
        }
        
        System.out.println("New VAT identification number: ");
        String vatId = scanner.nextLine();
        
        System.out.println("New customer address: ");
        String address = scanner.nextLine();
        
        customer.setVatId(vatId);
        customer.setAddress(address);
        
        System.out.println("Customer info updated");
    }


    public static void delete_customer() {
        System.out.println("Customer's name:");
        String name = scanner.nextLine();
        
        Customer customer = find_customer(name, customers);
        
        if ( customer == null ) {
            System.out.println("Customer not found.\n");
            return;
        }
        
        customers.remove(customer);
        
        System.out.println("\nCustomer deleted\n");
    }
    
    public static void list_customers() {

        System.out.println("\nList of customers:");
        
        for ( Customer customer : customers ) {

            System.out.println( "Name: " + customer.getName() );
            System.out.println( "VAT id number: " + customer.getVatId() );
            System.out.println( "Address: " + customer.getAddress() );
            System.out.println( "Creation date: " + customer.getCreationDate() + "\n" );
        }
    }
    

    private static Customer find_customer( String name, List<Customer> customers ) {

        for ( Customer customer : customers ) {
            if ( customer.getName().equals(name) ) {
                return customer;
            }
        }
        return null;
    }

    private String getVatId() { return this.VAT_id; }

    private String getAddress() { return this.address; }

    private Date getCreationDate() { return this.creation_date; }

    private String getName() { return this.name; }

    public void setAddress(String address) { this.address = address; }

    private void setVatId(String vat_id) { this.VAT_id = vat_id; }
}

