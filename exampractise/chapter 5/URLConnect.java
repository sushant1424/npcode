
import java.net.*;

public class URLConnect {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.example.com");

        URLConnection con = url.openConnection();
        System.out.println("Connected to" + url);
    }    
}
