import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCharacterBufferReader {
public static void main(String[] args) {
try {
BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\file.txt"));
int character;
while ((character = reader.read()) != -1) {
// Proses karakter yang dibaca
System.out.print((char) character);
}
reader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
