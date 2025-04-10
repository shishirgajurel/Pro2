package via.pro2.tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        final int PORT = 4025;
        System.out.println("Starting Server....");
        ServerSocket listenSocket = new ServerSocket(PORT);

        while (true) {
            System.out.println("Waiting for client....");
            Socket socket = listenSocket.accept();
            //create IO Stream
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            //communicate with client
            String request = in.readLine();
            System.out.println("Client request: " + request);

            //System.out.println("Client request :" + in.readLine());
            //process request
            String reply = request.toUpperCase();
            System.out.println("Server reply: " + reply);
            //send reply to client
            out.println(reply);
            //loop back to wait for another client
        }
        //close stream and socket

    }
}
