import java.net.*;
import java.io.*;
import java.util.*;

public class MultiThreadDate {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(5000);

        while (true) { 
            Socket socket = server.accept();
            new MultiThread(socket).start();            
        }}}

    class MultiThread extends Thread{
        Socket socket;

         MultiThread(Socket socket){
            this.socket = socket;
        }

        public void run(){
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            Date curDate = new Date();
            out.println(curDate);
        }
    }
    

