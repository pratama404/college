import java.io.FileWriter;
import java.io.IOException;
public class modefilewriter {
public static void main(String[] args) {
try {
// Membuka file dalam mode "write" dengan menggunakan FileWriter
FileWriter fileWriter = new FileWriter("data.txt");
// Menulis data ke file
String data = "Contoh tulisan untuk ditulis ke file dengan file writter.";
fileWriter.write(data);
// Menutup file setelah selesai menulis
fileWriter.close();
System.out.println("Data berhasil ditulis ke file.");
} catch (IOException e) {
System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
}
}
}