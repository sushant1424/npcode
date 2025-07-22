import java.net.*;
import java.io.*;

public class HttpGet {
    public static void main(String[] args) throws Exception {
    URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

    HttpURLConnection con = (HttpURLConnection) url.openConnection();

    con.setRequestMethod("GET");

    int response = con.getResponseCode();
    System.out.println("response:"+ response);
    
    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

    String line;
    while((line = in.readLine())!=null){
        System.out.println(line);
    }
    }}

