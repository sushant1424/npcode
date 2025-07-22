import java.net.URL;
public class SplittingURL {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://username:password@example.com:8080/blog/articale.html?id=3");

        System.out.println(url.getAuthority());
        System.out.println(url.getFile());
        System.out.println(url.getUserInfo());
    }
}
