import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("file.txt");
        
        if (file.delete()) {
            System.out.println("halo ageng, file yanga anda pilih berhasil dihapus.");
        } else {
            System.out.println(" maaf saya gagal menghapus file atau file tidak ditemukan.");
        }
    }
}
