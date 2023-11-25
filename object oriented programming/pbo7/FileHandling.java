import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            // Membuka file untuk pembacaan
            reader = new FileReader("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\isifilehandling.txt");
            
            // Lakukan operasi membaca atau menulis file di sini
            
        } catch (IOException e) {
            // Tangani exception yang terjadi
            e.printStackTrace();
        } finally {
            // Tutup file dalam blok finally untuk memastikan penutupan yang benar
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


