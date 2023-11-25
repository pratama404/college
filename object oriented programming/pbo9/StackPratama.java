import java.util.Stack;
import java.util.Scanner;

public class StackPratama {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Edit Data (Puncak Stack)");
            System.out.println("3. Hapus Data (Puncak Stack)");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data yang ingin Anda tambahkan: ");
                    String dataToAdd = scanner.nextLine();
                    stack.push(dataToAdd);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Data sekarang: " + stack);
                        System.out.print("Masukkan data baru (pada puncak stack): ");
                        String newData = scanner.nextLine();
                        stack.pop(); // Hapus puncak stack
                        stack.push(newData);
                    } else {
                        System.out.println("Stack kosong. Tidak ada data untuk diedit.");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        String dataDeleted = stack.pop(); // Hapus puncak stack dan simpan nilainya
                        System.out.println("Data yang dihapus: " + dataDeleted);
                    } else {
                        System.out.println("Stack kosong. Tidak ada data untuk dihapus.");
                    }
                    break;

                case 4:
                    System.out.println("Data Sekarang: " + stack);
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
