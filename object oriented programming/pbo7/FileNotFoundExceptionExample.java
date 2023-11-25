import java.io.*;
public class FileNotFoundExceptionExample {
public static void main(String[] args) {
try {
// Membuka file input
File file = new File("unknown.txt");
FileReader fileReader = new FileReader(file);
BufferedReader bufferedReader = new BufferedReader(fileReader);
String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
bufferedReader.close();
} catch (FileNotFoundException e) {
// Menangani pengecualian jika file tidak ditemukan
System.out.println("File tidak ditemukan: " + e.getMessage());
} catch (IOException e) {
e.printStackTrace();
}
}
}