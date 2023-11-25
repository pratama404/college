import java.io.*;
import java.nio.file.FileAlreadyExistsException; // Menambahkan impor untuk FileAlreadyExistsException

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Membuat file baru
            File file = new File("output.txt");
            boolean created = file.createNewFile();
            if (!created) {
                throw new FileAlreadyExistsException("File already exists");
            }
        } catch (FileAlreadyExistsException e) {
            // Menangani pengecualian jika file sudah ada
            System.out.println("File already exists: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
