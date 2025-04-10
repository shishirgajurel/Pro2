package via.pro2.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient
{
    final static int PORT = 2;
    // final static String HOST = "localhost";

    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);

        DatagramSocket clientSocket= new DatagramSocket();

        // translate the hostname to ip using DNS
        // InetAddressIPAddress= InetAddress.getByName(HOST);
        InetAddress IPAddress= InetAddress.getByName(InetAddress.getLocalHost().getHostName());
        byte[] sendData= new byte[1024];
        byte[] receiveData= new byte[1024];

        System.out.print("Write a line for the server: ");
        String sentence = input.nextLine();
        System.out.println("Client > " + sentence);
        sendData= sentence.getBytes();

        //create a datagram with data-to-send, length, ip, port
        DatagramPacket sendPacket= new DatagramPacket(sendData,sendData.length,IPAddress,PORT);

        // send datagram to server
        clientSocket.send(sendPacket);

        // read datagram from server
        DatagramPacket receivePacket= new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String modifiedSentence= new String(receivePacket.getData()).trim();
        System.out.println("Server > " + modifiedSentence);
        //close connection
        clientSocket.close();
    }
}