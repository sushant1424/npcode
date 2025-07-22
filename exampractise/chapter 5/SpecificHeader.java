
import java.net.*;

public class SpecificHeader {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.example.com");

        URLConnection con = url.openConnection();

        System.out.println(con.getContentType());
        System.out.println(con.getContentLength());
        System.out.println(con.getContentEncoding());
        System.out.println(con.getDate());
        System.out.println(con.getExpiration());
        System.out.println(con.getLastModified());
    }    
}
