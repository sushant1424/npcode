import java.net.URI;
public class ResolvingURI{
    public static void main(String[] args) throws Exception{
        URI base = new URI("https://www.example.com");
        URI relative = new URI("blog/index.html");

        URI resolved = base.resolve(relative);
        System.out.println(resolved);
    }
}