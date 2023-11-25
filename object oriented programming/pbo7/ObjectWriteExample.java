import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectWriteExample {
    public static class YourObject implements Serializable {
        // Isi dari kelas YourObject
    }

    public static void main(String[] args) {
        try {
            // Membuat objek YourObject
            YourObject obj = new YourObject();
            
            // Membuka file output stream
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ageng\\OneDrive\\Documents\\pbo7\\file.dat");
            
            // Membuka objek output stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            // Menulis objek ke dalam file
            objectOutputStream.writeObject(obj);
            
            // Menutup ObjectOutputStream
            objectOutputStream.close();
            
            System.out.println("Objek berhasil ditulis ke dalam file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

