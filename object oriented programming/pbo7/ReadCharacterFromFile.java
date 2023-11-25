import java.io.FileReader;
import java.io.IOException;
public class ReadCharacterFromFile {
public static void main(String[] args) {
try {
FileReader reader = new FileReader("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\file.txt");
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