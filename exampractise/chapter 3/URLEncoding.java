
import java.net.*;
import java.nio.charset.*;
public class URLEncoding {
    public static void main(String[] args) throws Exception{
        String filename = "report 1.pdf";
        String encodedFilename = URLEncoder.encode(filename,StandardCharsets.UTF_8);
        String sentence = "Hello world! I am happy";
        String encodedSentence = URLEncoder.encode(sentence,StandardCharsets.UTF_8);

        System.out.println(filename);
        System.out.println(encodedFilename);
        System.out.println(sentence);
        System.out.println(encodedSentence);


        
    }
}
