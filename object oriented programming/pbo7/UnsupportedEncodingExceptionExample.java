import java.io.*;
public class UnsupportedEncodingExceptionExample {
public static void main(String[] args) {
try {
// Membuka file input
File file = new File("input.txt");
FileInputStream fileInputStream = new FileInputStream(file);
InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,
"InvalidEncoding");
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
bufferedReader.close();
} catch (UnsupportedEncodingException e) {
// Menangani pengecualian jika encoding tidak didukung
System.out.println("Encoding tidak didukung: " + e.getMessage());
} catch (IOException e) {
e.printStackTrace();
}
}
}