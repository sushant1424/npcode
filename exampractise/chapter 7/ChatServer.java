import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String[] args) throws Exception{

        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        while (true) { 
            String clientMsg = in.readLine();
            System.out.println("client says:"+clientMsg);

            out.println(userInput.readLine());
        }}
    }

