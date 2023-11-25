import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamExample {
public static void main(String[] args) {
try {
InputStream inputStream = new FileInputStream("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\file.txt");
int data;
while ((data = inputStream.read()) != -1) {
// Proses data yang dibaca
System.out.print((char) data);
}
inputStream.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
