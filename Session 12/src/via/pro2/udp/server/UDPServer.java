package via.pro2.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer
{
    final static int PORT = 2;
    public static void main(String[] args) throws IOException
    {
        System.out.println("Starting Server");
        DatagramSocket serverSocket = new DatagramSocket(PORT);

        byte[] receiveData = new byte[1024];

        while (true)
        {
            System.out.println("Waiting for a client...");

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);

//    String sentence = new String(receivePacket.getData()).trim();
            String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());

            String capitalizedSentence = sentence.toUpperCase();

            // get the ip address and port number of the client
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            System.out.println("Client > " + sentence);
            System.out.println("Server > " + capitalizedSentence);

            byte[] sendData= new byte[1024];
            sendData= capitalizedSentence.getBytes();
            // create datagram to send to the client
            DatagramPacket sendPacket= new DatagramPacket(sendData, sendData.length,IPAddress, port);
            // write out datagram to socket
            serverSocket.send(sendPacket);
            // loop back and wait for another client connection
        }
    }
}