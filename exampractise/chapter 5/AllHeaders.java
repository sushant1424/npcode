import java.net.*;
import java.util.*;

public class AllHeaders {
    public static void main(String[] args) throws Exception{

        URL url = new URL("http://www.example.com");
        
        URLConnection con = url.openConnection();

        Map<String,List<String>> header = con.getHeaderFields();

        for(Map.Entry<String,List<String>> headers : header.entrySet()){
            String headerName = headers.getKey();
            List<String> headerValue = headers.getValue();

            if(headerName != null){
                System.out.println(headerName + " :" + String.join(", " + headerValue));
            }
            else{
                System.out.println("Status" + " :" + String.join(", " + headerValue));

            }
        }
    }    
}
