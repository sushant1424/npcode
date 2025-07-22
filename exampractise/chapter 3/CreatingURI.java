
import java.net.URI;
public class CreatingURI {
    public static void main(String[] args) throws Exception{
        URI uri = new URI("https://www.example.com/blog/index.html?id=3");

        System.out.println(uri);
    }
}
