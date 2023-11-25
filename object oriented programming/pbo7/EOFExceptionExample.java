import java.io.*;
public class EOFExceptionExample {
public static void main(String[] args) {
try {
// Membuka file input
File file = new File("input.txt");
FileInputStream fileInputStream = new FileInputStream(file);
DataInputStream dataInputStream = new DataInputStream(fileInputStream);
while (true) {
try {
// Membaca data dari file
int number = dataInputStream.readInt();
System.out.println(number);
} catch (EOFException e) {
// Menghentikan loop ketika mencapai akhir file
break;
}
}
dataInputStream.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}