import java.io.File;
import java.io.IOException;
public class Main {
public static void main(String[] args) {
// Langkah 1: Mengecek apakah file sudah tersedia
File file = new File("data.txt");
// Langkah 2: Memeriksa hak akses ke file
if (file.exists() && file.canRead()) {
try {
// Langkah 3: Mengecek keberadaan file
if (file.exists()) {
System.out.println("File sudah ada.");
} else {
System.out.println("File belum ada.");
}
// Langkah 4: Membaca atau menulis data ke dalam file
// ...
} catch (IOException e) {
System.out.println("Terjadi kesalahan saat membaca atau menulis file: " +
e.getMessage());
}
} else {
System.out.println("Tidak memiliki izin untuk membaca file.");
}
}
}