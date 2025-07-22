import java.net.*;

public class SystemPro {
 public static void main(String[] args) throws Exception{
    System.setProperty("http.proxyHost","proxy.example.com");
    System.setProperty("http.proxyPort","8080");
     System.setProperty("https.proxyHost","proxy.example.com");
    System.setProperty("https.proxyPort","8443");

    URL url = new URL("http://example.com");
    URLConnection con = url.openConnection();
    con.connect();
    System.out.println("connected to"+url);
    
 }   
}
