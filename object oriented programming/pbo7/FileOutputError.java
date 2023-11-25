import java.io.*;
public class FileOutputError {
public static void main(String[] args) {
try {
// Membuka file output
File file = new File("output.txt");
FileWriter fileWriter = new FileWriter(file);
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
// Menulis data ke file
bufferedWriter.write("Halo, dunia!");
bufferedWriter.newLine();
bufferedWriter.write("Ini adalah contoh penulisan ke file menggunakan Java.");
// Menutup file output
bufferedWriter.close();
} catch (IOException e) {
// Menangani pengecualian jika terjadi kesalahan operasi file
e.printStackTrace();
}
}
}