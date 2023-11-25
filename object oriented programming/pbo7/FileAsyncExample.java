import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class FileAsyncExample {
public static void main(String[] args) {
try {
Path path = Path.of("file.txt");
AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path,
StandardOpenOption.READ);
ByteBuffer buffer = ByteBuffer.allocate(1024);
long position = 0;
fileChannel.read(buffer, position, buffer, new CompletionHandler<>() {
@Override
public void completed(Integer result, ByteBuffer attachment) {
attachment.flip();
byte[] data = new byte[attachment.limit()];
attachment.get(data);
System.out.println(new String(data));
}
@Override
public void failed(Throwable exc, ByteBuffer attachment) {
exc.printStackTrace();
}
});
// Melanjutkan eksekusi program tanpa menunggu operasi file selesai
System.out.println("Program berlanjut...");
// Melakukan pekerjaan lain...
} catch (IOException e) {
e.printStackTrace();
}
}
}
