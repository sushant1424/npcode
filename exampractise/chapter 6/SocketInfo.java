import java.net.*;

public class SocketInfo {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("www.example.com",80);
        
        System.out.println("Remote Address:" +socket.getInetAddress());
        System.out.println("Remote Port:" +socket.getPort());
        System.out.println("Local Address:" +socket.getLocalAddress());
        System.out.println("Local Port:" +socket.getLocalPort());

        socket.close();
    }}

