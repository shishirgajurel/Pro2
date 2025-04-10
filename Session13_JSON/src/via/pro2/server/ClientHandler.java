package via.pro2.server;

import com.google.gson.Gson;
import via.pro2.model.Message;
import via.pro2.model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable
{
  private BufferedReader in;
  private PrintWriter out;

  public ClientHandler(Socket socket) throws IOException
  {
    in = new BufferedReader(new InputStreamReader(
        socket.getInputStream()));
    out = new PrintWriter(
        socket.getOutputStream(), true);
  }

  @Override
  public void run()
  {
    Gson gson = new Gson();
    try
    {
      // read line from client
      String clientText = in.readLine();
      System.out.println("Client " + clientText);
      // convert from JSON
      Student student = gson.fromJson(clientText, Student.class);
      // create a reply
      Message reply = new Message(student, "Welcome");
      // convert to JSON
      String replyJson = gson.toJson(reply);
      // send to client
      System.out.println("Server " + replyJson);
      out.println(replyJson);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
