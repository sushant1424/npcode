import java.net.URL;
public class RetreivingURL{
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.example.com:8080/blog/index.html?id=2#1.pdf");

        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
        System.out.println(url.getRef());
    }
}