import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class bab72kasus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tanggal lahir
        System.out.print("Masukkan tanggal lahir (dd-MM-yyyy): ");
        String tanggalLahirStr = scanner.nextLine();

        // Konversi string tanggal lahir ke LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

        // Menghitung usia dalam kalender Masehi
        LocalDate hariIni = LocalDate.now();
        long usiaMasehi = ChronoUnit.YEARS.between(tanggalLahir, hariIni);

        // Menghitung usia dalam kalender Hijriah
        HijrahDate hijrahDate = HijrahDate.from(tanggalLahir);
        HijrahDate hariIniHijriah = HijrahDate.now();
        long usiaHijriah = ChronoUnit.YEARS.between(hijrahDate, hariIniHijriah);

        // Output usia dalam kalender Masehi dan Hijriah
        System.out.println("Usia Anda dalam kalender Masehi adalah " + usiaMasehi + " tahun.");
        System.out.println("Usia Anda dalam kalender Hijriah adalah " + usiaHijriah + " tahun.");

        // Pendaftaran pengguna (simulasi)
        System.out.println("\nPendaftaran User Baru");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        User newUser = new User(nama, email, password);

        if (newUser.isRegistered()) {
            System.out.println("Pendaftaran berhasil! Selamat datang, " + newUser.getNama() + "!");
        } else {
            System.out.println("Maaf, terjadi kesalahan dalam pendaftaran. Silakan coba lagi.");
        }

        scanner.close();
    }
}

class User {
    private String nama;
    private String email;
    private String password;
    private boolean registered;

    public User(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.registered = saveUser();
    }

    public boolean isRegistered() {
        return registered;
    }

    public String getNama() {
        return nama;
    }

    private boolean saveUser() {
        // Simulasikan penyimpanan informasi pengguna ke dalam basis data
        // Di sini, kita hanya mengembalikan nilai true untuk mensimulasikan pendaftaran yang berhasil
        return true;
    }
}