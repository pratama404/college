import java.io.*;
public class SecurityExceptionExample {
public static void main(String[] args) {
try {
// Membuka file output
File file = new File("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\nama_file.txt");
FileWriter fileWriter = new FileWriter(file);
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
bufferedWriter.write("Data rahasia");
bufferedWriter.close();
} catch (SecurityException e) {
// Menangani pengecualian jika ada pembatasan keamanan
System.out.println("Tidak diizinkan mengakses file: " + e.getMessage());
} catch (IOException e) {
e.printStackTrace();
}
}
}