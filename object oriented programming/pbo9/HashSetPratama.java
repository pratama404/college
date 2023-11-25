import java.util.HashSet;
import java.util.Scanner;

public class HashSetPratama {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi HashSet dengan beberapa data awal
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

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
                    set.add(newData);
                    break;

                case 2:
                    System.out.print("Masukkan data yang ingin Anda sisipkan: ");
                    String newDataToInsert = scanner.nextLine();
                    System.out.print("Masukkan posisi sisipan (indeks): ");
                    int insertIndex = scanner.nextInt();

                    if (insertIndex >= 0 && insertIndex <= set.size()) {
                        boolean inserted = false;
                        int currentIndex = 0;
                        for (String data : set) {
                            if (currentIndex == insertIndex) {
                                System.out.println("Data " + newDataToInsert + " telah disisipkan pada indeks " + insertIndex);
                                set.add(newDataToInsert);
                                inserted = true;
                                break;
                            }
                            currentIndex++;
                        }
                        if (!inserted) {
                            System.out.println("Data " + newDataToInsert + " telah disisipkan pada akhir indeks");
                            set.add(newDataToInsert);
                        }
                    } else {
                        System.out.println("Posisi sisipan tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan data yang ingin Anda edit: ");
                    String oldData = scanner.nextLine();
                    System.out.print("Masukkan data penggantinya: ");
                    String newDataToEdit = scanner.nextLine();

                    if (set.contains(oldData)) {
                        set.remove(oldData);
                        set.add(newDataToEdit);
                    } else {
                        System.out.println("Data yang ingin diubah tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan data yang ingin Anda hapus: ");
                    String dataToDelete = scanner.nextLine();

                    if (set.contains(dataToDelete)) {
                        set.remove(dataToDelete);
                    } else {
                        System.out.println("Data yang ingin dihapus tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Data Sekarang: " + set);
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
