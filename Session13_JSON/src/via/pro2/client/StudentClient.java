package via.pro2.client;

import com.google.gson.Gson;
import via.pro2.model.Message;
import via.pro2.model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class StudentClient
{
  public static void main(String[] args)
 throws IOException
  {
    final int PORT = 4525;
    final String HOST = "localhost";
    Gson gson = new Gson();

    // create socket and streams
    Socket socket = new Socket(HOST, PORT);
    Scanner fromUser = new Scanner(System.in);
    BufferedReader inFromServer = new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

    // Read from keyboard
    System.out.println("Enter your name:");
    String name = fromUser.nextLine();
    System.out.println("Enter student number: ");
    int number = fromUser.nextInt();
    fromUser.close();

    // create student object
    Student student = new Student(name, number);
    System.out.println("Student object:" + student);
    // convert to JSON
    String json = gson.toJson(student);
    // send to server
    out.println(json);

    // read reply
    String serverReply = inFromServer.readLine();
    System.out.println("From Server: " + serverReply);

    // convert Message from JSON
    Message reply = gson.fromJson(serverReply, Message.class);
    System.out.println("Message: " + reply);

    System.out.println("Student only:" + reply.getStudent());
    // close connect
    socket.close();
  }
}
