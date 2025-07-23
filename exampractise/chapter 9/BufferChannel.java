import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class BufferChannel {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("file.txt");
        FileChannel channel = fis.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        channel.read(buffer);

        buffer.flip();

        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
            buffer.clear();
        }
    }
}
