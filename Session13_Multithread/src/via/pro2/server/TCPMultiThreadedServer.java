package via.pro2.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMultiThreadedServer {
    final static int PORT = 4425;

    public static void main(String[] args) throws IOException {
        System.out.println("Starting server ...");
        //Create listen Socket
        ServerSocket listenSocket = new ServerSocket(PORT);
        while (true) {
            System.out.println("Waiting for a client...");
            Socket socket = listenSocket.accept();

            //Start a new thread with a client
          ClientHandeler c =  new ClientHandeler(socket);
          Thread thread = new Thread(c);
          thread.start();

        }
    }

}
