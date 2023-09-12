import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bab7EmpatKasus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Aplikasi Pilihan");
            System.out.println("1. Peminjaman Buku");
            System.out.println("2. Kalkulator Sederhana");
            System.out.println("3. Konversi Mata Uang");
            System.out.println("4. Aplikasi Pembelian Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih aplikasi (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookLoanApp(scanner);
                    break;
                case 2:
                    calculatorApp(scanner);
                    break;
                case 3:
                    currencyConverterApp(scanner);
                    break;
                case 4:
                    shoppingApp(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Aplikasi tidak valid");
                    break;
            }
        }
    }

    public static void bookLoanApp(Scanner scanner) {
        // Input informasi peminjaman buku
        System.out.println("Peminjaman Buku");
        System.out.print("Masukkan nama peminjam: ");
        scanner.nextLine(); // Membersihkan newline dari input sebelumnya
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judulBuku = scanner.nextLine();
        System.out.print("Masukkan tanggal peminjaman (dd-MM-yyyy): ");
        String tanggalPeminjamanStr = scanner.nextLine();

        // Konversi string tanggal peminjaman ke LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalPeminjaman = LocalDate.parse(tanggalPeminjamanStr, formatter);

        // Hitung tanggal pengembalian
        LocalDate tanggalPengembalian = tanggalPeminjaman.plusDays(7);

        // Hitung jumlah hari tersisa untuk pengembalian
        long hariTersisa = ChronoUnit.DAYS.between(LocalDate.now(), tanggalPengembalian);

        // Output informasi peminjaman buku
        System.out.println("\nPeminjaman Sukses");
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman.format(formatter));
        System.out.println("Tanggal Pengembalian: " + tanggalPengembalian.format(formatter));
        System.out.println("Hari Tersisa: " + hariTersisa);
    }

    public static void calculatorApp(Scanner scanner) {
        // Kalkulator Sederhana
        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Pembagian oleh nol tidak valid.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }

    public static void currencyConverterApp(Scanner scanner) {
        // Konversi Mata Uang
        System.out.println("Konversi Mata Uang");
        System.out.print("Masukkan jumlah uang dalam mata uang asal: ");
        double jumlahUang = scanner.nextDouble();
        System.out.print("Masukkan nilai tukar mata uang asal ke mata uang tujuan: ");
        double nilaiTukar = scanner.nextDouble();
        double hasilKonversi = jumlahUang * nilaiTukar;
        System.out.println("Hasil konversi: " + hasilKonversi);
    }

    public static void shoppingApp(Scanner scanner) {
        // Aplikasi Pembelian Barang
        System.out.println("Aplikasi Pembelian Barang");
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        int jumlahBarang = scanner.nextInt();
        double totalHarga = 0;

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + i);
            System.out.print("Masukkan nama barang: ");
            scanner.nextLine(); // Membersihkan newline dari input sebelumnya
            String namaBarang = scanner.nextLine();
            System.out.print("Masukkan harga barang: ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Masukkan jumlah barang yang akan dibeli: ");
            int jumlahBeli = scanner.nextInt();
            double subtotal = hargaBarang * jumlahBeli;
            totalHarga += subtotal;
            System.out.println("Subtotal: " + subtotal);
        }

        System.out.println("\nTotal Harga: " + totalHarga);
    }
}
