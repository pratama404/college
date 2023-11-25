import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Membuka file untuk pembacaan
            reader = new BufferedReader(new FileReader("file.txt"));
            
            // Membaca baris pertama dari file
            String line = reader.readLine();
            System.out.println("Isi filenya yang berisi ini adalah: " + line);
        } catch (IOException e) {
            // Menangani IOException
            System.err.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        } finally {
            try {
                // Menutup file (jika terbuka) dalam blok finally
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Terjadi kesalahan saat menutup file: " + e.getMessage());
            }
        }
    }
}
