import java.net.InetAddress;

public class SpamCheck {
 public static void main(String[] args) throws Exception{
    String spamServer = "spam.example.com";

    InetAddress address = InetAddress.getByName(spamServer);
    System.out.println("It micht be spam "+address.getHostAddress());
 }   
}
