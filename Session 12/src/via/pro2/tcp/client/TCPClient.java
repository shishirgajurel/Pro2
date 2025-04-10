package via.pro2.tcp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws UnknownHostException, IOException {


        final int PORT = 5677;
        final String HOST = "localhost";
        //create keyboard in
        Scanner input = new Scanner(System.in);
        //create a client socket
        Socket clientSocket = new Socket(HOST, PORT);
        //create the stream
        BufferedReader in = new  BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
                clientSocket.getOutputStream(), true);
        System.out.println("Enter your request: ");
        String request = input.nextLine(); // read line from the keyboard

        System.out.println("Client >> " + request);

        //send request to server
        out.println(request);
        //receive reply from server
        String reply = in.readLine();
        System.out.println("Server >> " + reply);
        //close stream and socket
        in.close();
        out.close();
        clientSocket.close();
    }

}
