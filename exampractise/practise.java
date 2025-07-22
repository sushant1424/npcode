import java.net.*;
import java.util.List;

public class practise{
    public static void main(String[] args) throws Exception{
        CookieManager manager = new CookieManager();
        CookieHandler.setDefault(manager);

        URL url = new URL("https://httpbin.org/cookies/set?username=JohnDoe&session=abc123");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.getResponseCode();

        CookieStore store = manager.getCookieStore();
        List<HttpCookie> cookies = store.getCookies();

        for(HttpCookie c : cookies){
            System.out.println(c.getName());
            System.out.println(c.getValue());
            System.out.println(c.getDomain());
            System.out.println(c.getPath());
            System.out.println(c.getMaxAge());
            System.out.println(c.getSecure());
        }

    }
}