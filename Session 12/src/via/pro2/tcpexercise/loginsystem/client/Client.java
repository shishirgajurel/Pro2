package via.pro2.tcpexercise.loginsystem.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) throws IOException
    {
        final int PORT = 5678;
        final String HOST = "localhost";

        Scanner scanner = new Scanner(System.in);

        Socket clientSocket = new Socket(HOST, PORT);

        System.out.print("Connect with the server using the magic word: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        // request to connect
        String connect = scanner.nextLine();
        out.println(connect);

        // response regarding connection
        String connectionResponse = in.readLine();

        if (!connectionResponse.equals("Connected"))
        {
            System.out.println("Disconnected!!!");
            clientSocket.close();
            in.close();
            out.close();
        }

        String usernameRequest = in.readLine();
        if (usernameRequest.equals("Username"))
        {
            System.out.print("Type in your username: ");
            String usernameResponse = scanner.nextLine();
            out.println(usernameResponse);
        }

        String passwordRequest = in.readLine();
        if (passwordRequest.equals("Password"))
        {
            System.out.print("Type in your password: ");
            String passwordResponse = scanner.nextLine();
            out.println(passwordResponse);
        }
    

        String approval = in.readLine();
        if (approval.equals("Approved"))
        {
            System.out.println("Approved!");
        }
        else
        {
            System.out.println("Disapproved..");
        }

        out.close();
        in.close();
        clientSocket.close();
    }
}