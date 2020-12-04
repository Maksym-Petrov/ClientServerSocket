import Petrov.Phone;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try (Phone phone = new Phone("127.0.0.1",60277)) {

            System.out.println("Connected to server");
            String request = "Sumy";
            System.out.println("Request: " + request);

            phone.writeLine(request);
            String response = phone.readLine();
            System.out.println("Response: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

