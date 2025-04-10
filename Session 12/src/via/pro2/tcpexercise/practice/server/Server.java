package via.pro2.tcpexercise.practice.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        final int PORT = 5677;
        ServerSocket listenSocket = new ServerSocket(PORT);

        while (true) {
            System.out.println("Starting server ...");
            Socket socket = listenSocket.accept();

            BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String request = in.readLine();
            if (request.toLowerCase().equals("connect")){

                out.println("Connection Established...");
                String clientIP = socket.getInetAddress().getHostAddress();
                System.out.println("Client IP: " + clientIP);

                out.println("Username: ");
                String username = in.readLine();

                System.out.println("Client username: " + username);

                out.println("Password: ");
                String passwordResponse = in.readLine();
                System.out.println("Password is: " + passwordResponse);

            }
            else {
                out.println("Connection Established Failed");
                in.close();
                out.close();
                socket.close();

            }



        }

    }
}
