/*public class trycatch {
    public static void main(String[] args) {
        try {
            openResource(); // Potensi terjadi pengecualian di sini
        } finally {
            // Blok finally akan selalu dieksekusi, terlepas dari pengecualian apa pun
            closeResource(); // Kode untuk membersihkan sumber daya
        }
        
        // Kode setelah blok try-finally
        System.out.println("Program berlanjut setelah blok try-finally");
    }

    public static void openResource() {
        // Kode untuk membuka sumber daya
        System.out.println("Membuka sumber daya");
    }

    public static void closeResource() {
        // Kode untuk menutup sumber daya
        System.out.println("Menutup sumber daya");
    }
}
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; // Perhatikan pengimporan ini
import java.io.IOException;

public class trycatch {
    public static void main(String[] args) {
        try {
            // Contoh penggunaan try-catch untuk pengecualian yang diperiksa
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("Isi file: " + line);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan IO: " + e.getMessage());
        }

        try {
            // Contoh penggunaan try-finally untuk penanganan sumber daya
            FileWriterExample.writeToFile("output.txt", "Isi file ini akan ditulis ke dalam file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan IO saat menulis file: " + e.getMessage());
        }

        try {
            // Contoh penggunaan throw untuk melempar pengecualian kustom
            int result = divide(10, 2);
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return numerator / denominator;
    }
}

class FileWriterExample {
    public static void writeToFile(String fileName, String content) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
