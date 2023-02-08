package hw10t3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class task3 extends InputStream {
    private Queue<Byte> bytes = new ArrayDeque<>();

    public task3(String sourceString){
        byte[] stringBytes = sourceString.getBytes();
        for (byte stringByte : stringBytes) {
            bytes.add(stringByte);
        }
    }
    @Override
    public int read() throws IOException {
        if(available()>0){
            return bytes.poll();
        }
        return -1;
    }

    @Override
    public int available() throws IOException {
        return bytes.size();
    }
}
