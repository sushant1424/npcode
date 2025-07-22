import java.io.BufferedReader;
import java.io.FileReader;
public class LogFileProcessing {
    public static void main(String[] args) throws Exception{
        String logFile = "server.log";

        BufferedReader br = new BufferedReader(new FileReader(logFile));
        String line;
        while((line = br.readLine())!=null){
            if(line.contains("200")){
                System.out.println(line);
            }
        }
    }
}
