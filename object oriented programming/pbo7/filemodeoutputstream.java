import java.io.FileOutputStream;
import java.io.IOException;
public class filemodeoutputstream {
public static void main(String[] args) {
try {
// Membuka file dalam mode "write" dengan menggunakan FileOutputStream
FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
// Menulis data ke file
String data = "Contoh tulisan untuk ditulis ke file.";
fileOutputStream.write(data.getBytes());
// Menutup file setelah selesai menulis
fileOutputStream.close();
System.out.println("Data berhasil ditulis ke file.");
} catch (IOException e) {
System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
}
}
}