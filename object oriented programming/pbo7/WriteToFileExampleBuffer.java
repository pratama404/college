import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFileExampleBuffer {
public static void main(String[] args) {
try {
// Membuka file untuk penulisan
FileWriter fileWriter = new FileWriter("file.txt");
BufferedWriter writer = new BufferedWriter(fileWriter);
// Menulis karakter ke file
writer.write("A kalo ini pake buffer writer");
// Menutup file
writer.close();
System.out.println("Karakter berhasil ditulis ke file dengen Bufferwriter.");
} catch (IOException e) {
e.printStackTrace();
}
}
}