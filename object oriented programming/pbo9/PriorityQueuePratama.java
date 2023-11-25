import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class PriorityQueuePratama {
    public static void main(String[] args) {
        List<Integer> queue = new LinkedList<>();
		queue.add(3); // Menambahkan elemen awal
        queue.add(1); // Menambahkan elemen awal
        queue.add(2); // Menambahkan elemen awal
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data yang ingin Anda tambahkan: ");
                    int newData = scanner.nextInt();
                    queue.add(newData);
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Tidak ada data yang bisa dihapus. Queue kosong.");
                    } else {
                        System.out.print("Masukkan data yang ingin Anda hapus: ");
                        int dataToRemove = scanner.nextInt();

                        if (queue.contains(dataToRemove)) {
                            queue.remove(Integer.valueOf(dataToRemove)); // Menghapus berdasarkan nilai, bukan indeks
                            System.out.println("Data " + dataToRemove + " dihapus.");
                        } else {
                            System.out.println("Data tidak ditemukan dalam antrian.");
                        }
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Tidak ada data yang bisa diedit. Queue kosong.");
                    } else {
                        System.out.print("Masukkan data yang ingin Anda edit: ");
                        int dataToEdit = scanner.nextInt();
                        
                        if (queue.contains(dataToEdit)) {
                            System.out.print("Masukkan nilai baru: ");
                            int newDataValue = scanner.nextInt();
                            int index = queue.indexOf(dataToEdit);
                            queue.set(index, newDataValue);
                            System.out.println("Data " + dataToEdit + " telah diubah menjadi " + newDataValue);
                        } else {
                            System.out.println("Data tidak ditemukan dalam antrian.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Data Sekarang:");
                    for (int data : queue) {
                        System.out.print(data + " ");
                    }
                    System.out.println();
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
