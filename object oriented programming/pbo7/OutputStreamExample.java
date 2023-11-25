import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class OutputStreamExample {
public static void main(String[] args) {
try {
OutputStream outputStream = new FileOutputStream("C:\\Users\\ageng\\OneDrive\\Documents\\file.txt");
String data = "Hello, World!";
byte[] bytes = data.getBytes();
outputStream.write(bytes);
outputStream.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}