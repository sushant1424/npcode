import java.net.*;

public class Inet4and6 {
    public static void main(String[] args) throws Exception{
        InetAddress address = InetAddress.getByName("www.google.com");

        if(address instanceof Inet4Address){
            System.out.println("It is ipv4");
        }
        if(address instanceof Inet6Address){
            System.out.println("It is ipv6");
        }
    }
}
