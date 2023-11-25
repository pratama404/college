import java.util.LinkedHashMap;
import java.util.Scanner;

public class PratamaLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama buah yang ingin Anda tambahkan: ");
                    String fruitToAdd = scanner.nextLine();
                    System.out.print("Masukkan nilai buah: ");
                    int valueToAdd = scanner.nextInt();
                    map.put(fruitToAdd, valueToAdd);
                    break;

                case 2:
                    System.out.print("Masukkan nama buah yang ingin Anda edit: ");
                    String fruitToEdit = scanner.nextLine();
                    System.out.print("Masukkan nilai buah yang baru: ");
                    int newValue = scanner.nextInt();
                    if (map.containsKey(fruitToEdit)) {
                        map.remove(fruitToEdit); // Hapus data lama
                        map.put(fruitToEdit, newValue); // Tambahkan data baru
                        System.out.println("Data " + fruitToEdit + " telah diubah menjadi " + newValue);
                    } else {
                        System.out.println("Buah yang ingin diubah tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama buah yang ingin Anda hapus: ");
                    String fruitToDelete = scanner.nextLine();
                    if (map.containsKey(fruitToDelete)) {
                        map.remove(fruitToDelete);
                    } else {
                        System.out.println("Buah yang ingin dihapus tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Data Sekarang: " + map);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}
