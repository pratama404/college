import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        try {
            int pilihan = input.nextInt();

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = tambah(angka1, angka2);
                    break;
                case 2:
                    hasil = kurang(angka1, angka2);
                    break;
                case 3:
                    hasil = kali(angka1, angka2);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = bagi(angka1, angka2);
                    } else {
                        System.out.println("Pembagian oleh nol tidak diizinkan.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }

            System.out.println("Hasil: " + hasil);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Terjadi kesalahan input. Pastikan Anda memasukkan angka yang valid.");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Terjadi kesalahan matematika. Pastikan Anda tidak membagi oleh nol.");
        }
    }

    // Fungsi penambahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Fungsi pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Fungsi perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Fungsi pembagian
    public static double bagi(double a, double b) {
        return a / b;
    }
}
