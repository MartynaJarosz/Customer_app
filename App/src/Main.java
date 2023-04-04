import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner( System.in );
        Customer c = new Customer();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - add a customer");
            System.out.println("2 - edit a customer");
            System.out.println("3 - list customers");
            System.out.println("4 - delete a customer");
            System.out.println("5 - exit");
            
            int n = scanner.nextInt();
            
            switch (n) {
                case 1:
                    c.add_customer();
                    break;
                case 2:
                    c.edit_customer();
                    break;
                case 3:
                    c.list_customers();
                    break;
                case 4:
                    c.delete_customer();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong option. Try again.");
                    break;
            }
        }
    }
}
