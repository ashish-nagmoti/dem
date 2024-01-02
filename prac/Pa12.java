import java.util.Scanner;

public class Pa12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ip address:");
        String ip = sc.nextLine();

        char Ipclass = findclass(ip);
        System.out.println("Ipclass:" + Ipclass);

        String bin = iptobin(ip);
        System.out.println("Ip address in binary format:" + bin);

        sc.close();
    }

    static char findclass(String ip) {

        int fo = Integer.parseInt(ip.split("\\.")[0]);
        if (fo >= 1 && fo <= 127) {
            return 'A';
        } else if (fo >= 128 && fo <= 191) {
            return 'B';
        } else if (fo >= 192 && fo <= 223) {
            return 'C';
        } else if (fo >= 224 && fo <= 239) {
            return 'D';
        } else if (fo >= 240 && fo <= 250) {
            return 'E';
        } else {
            return 'I';
        }
    }

    static String iptobin(String ip) {
        StringBuilder binaryFormat = new StringBuilder();

        // Split the IP address using dots
        String[] octets = ip.split("\\.");

        // Convert each octet to binary and append to the result
        for (String octet : octets) {
            int decimal = Integer.parseInt(octet);
            String binary = Integer.toBinaryString(decimal);

            // Ensure that each octet is represented by 8 bits
            while (binary.length() < 8) {
                binary = "0" + binary;
            }

            binaryFormat.append(binary).append(".");
        }

        // Remove the trailing dot
        return binaryFormat.substring(0, binaryFormat.length() - 1);
    }
    }
}