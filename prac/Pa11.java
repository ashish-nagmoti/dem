import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Pa11 {

    public static void calculateSubnet(String ipAddress, String subnetMask) {
        try {
            InetAddress ip = InetAddress.getByName(ipAddress);
            InetAddress subnet = InetAddress.getByName(subnetMask);

            byte[] ipBytes = ip.getAddress();
            byte[] subnetBytes = subnet.getAddress();

            for (int i = 0; i < ipBytes.length; i++) {
                int network = ipBytes[i] & subnetBytes[i];
                System.out.println("Network Address Byte " + (i + 1) + ": " + network);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String ipAddress = scanner.nextLine();

        System.out.print("Enter Subnet Mask: ");
        String subnetMask = scanner.nextLine();

        calculateSubnet(ipAddress, subnetMask);
    }
}
