import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        
        try {
            reader = new FileReader("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\isifilehandling.txt");
            // Lakukan operasi membaca atau menulis file di sini
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
