import java.util.BitSet;
import java.util.Scanner;

public class BitSetPratama {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);

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
                    System.out.print("Masukkan indeks data yang ingin Anda tambahkan: ");
                    int indexToAdd = scanner.nextInt();
                    bitSet.set(indexToAdd, true);
                    break;

                case 2:
                    System.out.print("Masukkan indeks data yang ingin Anda edit: ");
                    int indexToEdit = scanner.nextInt();

                    if (bitSet.get(indexToEdit)) {
                        // Jika bit di indeks ini adalah true, ubah menjadi false
                        bitSet.set(indexToEdit, false);
                    } else {
                        // Jika bit di indeks ini adalah false, ubah menjadi true
                        bitSet.set(indexToEdit, true);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan indeks data yang ingin Anda hapus: ");
                    int indexToDelete = scanner.nextInt();
                    bitSet.set(indexToDelete, false);
                    break;

                case 4:
                    System.out.println("Data Sekarang: " + bitSet);
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
