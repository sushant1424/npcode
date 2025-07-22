import java.net.*;
public class ObjectMethods {
   public static void main(String[] args) throws Exception{
    InetAddress address = InetAddress.getByName("www.google.com");
    System.out.println("Hostname:" + address.getHostName());
    System.out.println("IP:" + address.getHostAddress());
    System.out.println("Canon:" + address.getCanonicalHostName());

    InetAddress address1 = InetAddress.getByName("www.youtube.com");
    System.out.println(address.equals(address1));

    System.out.println(address1.toString());
   } 
}
