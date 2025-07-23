import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();

        String msg = "hello";
        byte[] buffer = msg.getBytes();

        InetAddress address = InetAddress.getByName("localhost");
        int port = 443;

        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address,port);
        socket.send(packet);
        byte[] recvBuffer = new byte[1024];

        DatagramPacket rPacket = new DatagramPacket(recvBuffer,recvBuffer.length);
        socket.receive(rPacket);
        String response = new String(rPacket.getData(),0,rPacket.getLength());

        


    }
}
