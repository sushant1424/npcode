import java.net.URL;

public class ConvertingURL {
 public static void main(String[] args) throws Exception{
    URL url = new URL("https://www.example.com/index.html?name=value");

    System.out.println(url.toString());
    System.out.println(url.toExternalForm());

 }  
}
