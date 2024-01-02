import java.net.*;
import java.util.*;

public class Pa9 {
    public static void main(String[] args) {
        String host;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter host name\n2. Enter IP address\nChoice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (choice == 1) {
            System.out.print("Enter host name: ");
            host = sc.nextLine();
        } else {
            System.out.print("Enter IP address: ");
            host = sc.nextLine();
        }

        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println("IP address: " + address.getHostAddress());
            System.out.println("Host name: " + address.getHostName());
            System.out.println("IP address and Host name: " + address.toString());
        } catch (UnknownHostException ex) {
            System.out.println("Could not find: " + host);
        }
    }
}
