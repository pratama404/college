import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.Map.Entry;

public class HashMapPratama {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buah");
            System.out.println("2. Edit Buah");
            System.out.println("3. Hapus Buah");
            System.out.println("4. Tampilkan Data Acak");
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
                    if (map.containsKey(fruitToEdit)) {
                        System.out.print("Masukkan nama buah yang baru: ");
                        String newFruitName = scanner.nextLine();
                        System.out.print("Masukkan nilai buah yang baru: ");
                        int newValue = scanner.nextInt();
                        map.put(newFruitName, newValue); // Mengganti nama dan nilai
                        map.remove(fruitToEdit); // Menghapus buah lama
                        System.out.println("Buah " + fruitToEdit + " telah diubah menjadi " + newFruitName + " dengan nilai " + newValue);
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
                    List<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
                    Collections.shuffle(entryList, new Random(System.nanoTime()));
                    
                    System.out.println("Data Sekarang (Acak):");
                    for (Map.Entry<String, Integer> entry : entryList) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
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
