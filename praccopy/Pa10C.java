import java.io.*;
import java.net.*;

public class Pa10C {
    public static void main(String[] args) {
        try {
            Socket sc = new Socket("localhost", 12345);
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            String message = in.readLine();
            System.out.println("Server says:" + message);
            sc.close();
        } catch (

        IOException e) {
            e.printStackTrace();
        }
    }
}