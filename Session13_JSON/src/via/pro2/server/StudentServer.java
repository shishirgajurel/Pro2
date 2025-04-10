package via.pro2.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer
{
  public static void main(String[] args) throws IOException
  {
    final int PORT = 4525;
    System.out.println("Starting the Server ...");
    ServerSocket listenSocket = new ServerSocket(PORT);
    while (true)
    {
      System.out.println("Waiting for a client");
      // wait for contact by client
      Socket socket = listenSocket.accept();
      // start
      Thread clientThread = new Thread(new ClientHandler(socket));
      clientThread.start();
    }
  }
}
