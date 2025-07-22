import java.net.*;

public class MacAddress {
    public static void main(String[] args) throws Exception{
        InetAddress address = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(address);

        byte[] mac = ni.getHardwareAddress();

        for(int i = 0; i < mac.length ; i++){
            System.out.format("%02X",mac[i]);
            if(i < mac.length-1 ){
                System.out.print("-");
            }
        }
    }
}
