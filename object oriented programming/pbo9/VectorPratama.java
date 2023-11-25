import java.util.Vector;
import java.util.Scanner;

public class VectorPratama {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Orange");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Sisipkan Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data yang ingin Anda tambahkan: ");
                    String newData = scanner.nextLine();
                    vector.add(newData);
                    break;

                case 2:
                    System.out.print("Masukkan data yang ingin Anda sisipkan: ");
                    String newDataToInsert = scanner.nextLine();
                    System.out.print("Masukkan posisi sisipan (indeks): ");
                    int insertIndex = scanner.nextInt();

                    if (insertIndex >= 0 && insertIndex <= vector.size()) {
                        vector.add(insertIndex, newDataToInsert);
                    } else {
                        System.out.println("Posisi sisipan tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan indeks data yang ingin Anda edit: ");
                    int indexToEdit = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToEdit >= 0 && indexToEdit < vector.size()) {
                        System.out.print("Masukkan data penggantinya: ");
                        String newElement = scanner.nextLine();
                        vector.set(indexToEdit, newElement);
                    } else {
                        System.out.println("Indeks data yang ingin diedit tidak valid.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan indeks data yang ingin Anda hapus: ");
                    int indexToDelete = scanner.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < vector.size()) {
                        vector.remove(indexToDelete);
                    } else {
                        System.out.println("Indeks data yang ingin dihapus tidak valid.");
                    }
                    break;

                case 5:
                    System.out.println("Data Sekarang: " + vector);
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}
