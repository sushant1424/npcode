import java.net.*;
import java.util.*;

public class NetworkInterfaceEg {
public static void main(String[] args) throws Exception{
    Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
   
    while(interfaces.hasMoreElements()){
        NetworkInterface ni = interfaces.nextElement();
        System.out.println(ni);
        System.out.println(ni.getName());
        System.out.println(ni.getDisplayName());

        Enumeration<InetAddress> address = ni.getInetAddresses();

        while(address.hasMoreElements()){
            InetAddress add = address.nextElement();
            System.out.println(add.getHostName());
        }
    }

}    
}
