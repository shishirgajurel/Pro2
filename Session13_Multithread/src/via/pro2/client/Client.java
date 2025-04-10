package via.pro2.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    final static int PORT = 4125;
    final static String HOST = "localhost";

    public static void main(String[] args) throws IOException {

        System.out.println("Starting client ...");

        final InetAddress host = InetAddress.getLocalHost();

        //Create Streams Scanner, input stream, sockets.

        Scanner input = new Scanner(System.in);
        //1 create a socket to connect to the server

        Socket clientSocket = new Socket(HOST, PORT);

        //2 create I/O streams for communication

        BufferedReader in = new BufferedReader(
        new InputStreamReader(clientSocket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
                clientSocket.getOutputStream(), true
        );

        //perform Communication
        System.out.println("Write a line to the server: ");
        String request = input.nextLine();
        System.out.println("Client Side >>" +request);

        //send
        out.println(request);

        // read
        String reply = in.readLine();
        System.out.println("Client Side <<" + reply);

        //close connection
        in.close();
        out.close();
        clientSocket.close();


    }
}
