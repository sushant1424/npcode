
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;



public class URLDecoding {
    public static void main(String[] args) throws Exception{
        String filename = "report+1.pdf";
        String sentence = "Hello+world%21+I+am+happy";
        String decodedFilename = URLDecoder.decode(filename,StandardCharsets.UTF_8);
        String decodedSentence = URLDecoder.decode(sentence,StandardCharsets.UTF_8);

        System.out.println(filename);
        System.out.println(decodedFilename);
        System.out.println(sentence);
        System.out.println(decodedSentence);
    }
}
