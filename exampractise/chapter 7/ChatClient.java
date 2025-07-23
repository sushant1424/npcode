import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        while (true) { 
            System.out.println("You:");
            out.println(userInput.readLine());
            
            String response = in.readLine();
            System.out.println(response);
        }}
    }

