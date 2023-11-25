import java.io.File;

public class CekFileJava {
    public static void main(String[] args) {
        String filePath = "data.txt";
        
        // Membuat objek File dengan path file yang ingin diperiksa
        File file = new File(filePath);
        
        // Mengecek apakah file ada atau tidak
        if (file.exists()) {
            System.out.println("File " + filePath + " halo ageng, file yang anda cek telah ada.");
        } else {
            System.out.println("File " + filePath + " maaf ageng, file yang anda cek tidak ada.");
        }
    }
}
