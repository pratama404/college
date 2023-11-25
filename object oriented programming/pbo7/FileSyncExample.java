import java.io.*;
public class FileSyncExample {
public static void main(String[] args) {
try {
// Membuka file untuk penulisan sinkron
FileWriter writer = new FileWriter("file.txt");
writer.write("Contoh operasi file sinkron");
writer.close();
// Membuka file untuk pembacaan sinkron
FileReader reader = new FileReader("file.txt");
int data;
while ((data = reader.read()) != -1) {
System.out.print((char) data);
}
reader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
