import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFileExample {
public static void main(String[] args) {
try {
// Membuka file untuk penulisan
FileWriter writer = new FileWriter("file.txt");
// Menulis karakter ke file
writer.write("A ini contih file writer");
// Menutup file
writer.close();
System.out.println("Karakter berhasil ditulis ke file.");
} catch (IOException e) {
e.printStackTrace();
}
}
}