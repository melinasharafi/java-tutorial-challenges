package java_nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream binaryFile = new FileOutputStream("binary.dat");
             FileChannel binaryChannele = binaryFile.getChannel();) {
            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(7);
            intBuffer.flip();
            binaryChannele.write(intBuffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
