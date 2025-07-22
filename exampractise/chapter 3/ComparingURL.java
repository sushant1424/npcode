
import java.net.URL;
public class ComparingURL {
    public static void main(String[] args) throws Exception{
        URL url1  = new URL("https://www.example.com/blog");
        URL url2  = new URL("https://www.example.com/blog");
        URL url3 = new URL("https://www.example.com/blog#1.pdf");

        System.out.println(url1.equals(url2));
        System.out.println(url1.equals(url3));
        System.out.println(url1.sameFile(url3));
    }    
}
