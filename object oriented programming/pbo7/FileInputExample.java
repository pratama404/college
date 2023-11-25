import java.io.*;
public class FileInputExample {
public static void main(String[] args) {
try {
// Membuka file input
File file = new File("input.txt");
FileReader fileReader = new FileReader(file);
BufferedReader bufferedReader = new BufferedReader(fileReader);
String line;
// Membaca isi file baris per baris
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}
// Menutup file input
bufferedReader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
