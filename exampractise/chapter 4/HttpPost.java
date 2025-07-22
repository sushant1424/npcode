import java.net.*;
import java.io.*;
public class HttpPost {
    public static void main(String[] args) throws Exception{

    URL url = new URL("https://jsonplaceholder.typicode.com/posts");

    HttpURLConnection con = (HttpURLConnection) url.openConnection();

    con.setRequestMethod("POST");
    con.setRequestProperty("content-type","application/json");
    con.setDoOutput(true);

    String jsonInput = "{\"title\":\"foo\",\"body\":\"bar\",\"user id\":1}";

    try(OutputStream os = con.getOutputStream()){
        os.write(jsonInput.getBytes());
        os.flush();
    }

    int response = con.getResponseCode();
    System.out.println("response:"+ response);
        
    }
}