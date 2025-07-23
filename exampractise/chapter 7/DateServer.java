import java.net.*;
import java.io.*;
import java.util.*;
public class DateServer {
    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(5000);

        Socket socket = serverSocket.accept();
        System.out.println("Clent is connected!");

        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        Date curDate = new Date();
        out.println("Current date is:"+curDate);

        out.close();
        socket.close();
        serverSocket.close();

    }
}
