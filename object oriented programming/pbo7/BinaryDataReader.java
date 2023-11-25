import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryDataReader {
    public static void main(String[] args) {
        try {
            // Membuka file dalam mode "read" dengan FileInputStream
            FileInputStream fileInputStream = new FileInputStream("data.bin");
            
            // Membuat objek DataInputStream untuk membaca data dalam format binary
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            
            // Membaca data dari file
            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();
            
            // Menutup file setelah selesai membaca
            dataInputStream.close();
            
            System.out.println("Data yang dibaca:");
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + booleanValue);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
