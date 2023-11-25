import java.io.*;
public class AccessDeniedExceptionExample {
public static void main(String[] args) {
try {
// Membuka file output
File file = new File("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\sensitive.txt");
FileWriter fileWriter = new FileWriter(file);
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
bufferedWriter.write("Data sensitif");
bufferedWriter.close();
} catch (SecurityException e) {
// Menangani pengecualian jika akses ditolak
System.out.println("Akses ditolak: " + e.getMessage());
} catch (IOException e) {
e.printStackTrace();
}
}
}
