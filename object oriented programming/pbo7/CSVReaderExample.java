import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        try {
            // Buat objek CSVReader dan baca data dari file CSV
            CSVReader reader = new CSVReader(new FileReader("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\file.csv"));
            String[] nextLine;
            
            while ((nextLine = reader.readNext()) != null) {
                // Proses data dalam setiap baris
                for (String data : nextLine) {
                    System.out.print(data + " ");
                }
                System.out.println(); // Pindah ke baris baru setelah membaca satu baris
            }
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
