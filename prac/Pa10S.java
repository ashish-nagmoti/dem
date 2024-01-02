import java.io.*;
import java.net.*;

public class Pa10S {
    public static void main(String[] args) {
        try {
            ServerSocket se = new ServerSocket(12345);
            System.out.println("Server is waiting");
            Socket cs = se.accept();
            System.out.println("Client connected");
            PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
            out.println("Hello form server");
            se.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}