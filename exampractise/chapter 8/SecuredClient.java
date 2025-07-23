import javax.net.ssl.*;
import java.io.*;

public class SecuredClient {
    public static void main(String[] args) throws Exception{
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        SSLSocket socket = (SSLSocket) factory.createSocket("localhost",444);

        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println("Hello!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println(in.readLine());




    }
}
