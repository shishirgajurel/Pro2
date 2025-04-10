package via.pro2.tcpexercise.loginsystem.server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        final int PORT = 5678;

        ServerSocket serverSocket = new ServerSocket(PORT);

        while (true)
        {
            System.out.println("Waiting for a client...");
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String request = in.readLine();

            if (!request.toLowerCase().equals("connect"))
            {
                out.println("Disconnected");
                in.close();
                out.close();
                socket.close();
            }

            else
            {
              out.println("Connected");
                String clientIP = socket.getInetAddress().getHostAddress();
                System.out.println("Client IP: " + clientIP);

               out.println("Username");
                String usernameResponse = in.readLine();
                System.out.println("Username is: " + usernameResponse);

          out.println("Password");
                String passwordResponse = in.readLine();
                System.out.println("Password is: " + passwordResponse);
 out.println("Approved");
                System.out.println("Approved!");
            }
            // loop back to wait for another client
        }
    }
}