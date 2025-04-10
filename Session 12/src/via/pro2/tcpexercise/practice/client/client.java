package via.pro2.tcpexercise.practice.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String args[]) throws IOException {

        final int PORT = 5677;
        final String HOST = "localhost";

        Scanner input = new Scanner(System.in);
        Socket socket = new Socket(HOST, PORT);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        System.out.println("Enter magical word: ");
        String magicWord = input.nextLine();
        out.println(magicWord);




    }
}
