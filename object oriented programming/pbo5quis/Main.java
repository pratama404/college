import java.util.Scanner;

class Permainan {
    protected String NamaPermainan;

    public Permainan(String NamaPermainan) {
        this.NamaPermainan = NamaPermainan;
    }

    public void Mulai() {
        System.out.println("Permainan " + NamaPermainan + " dimulai.");
    }

    public void Selesai() {
        System.out.println("Permainan " + NamaPermainan + " selesai.");
    }
}

class Bola extends Permainan {
    private int jumlahPemain;
    private String jenisLapangan;

    public Bola(String NamaPermainan, int jumlahPemain, String jenisLapangan) {
        super(NamaPermainan);
        this.jumlahPemain = jumlahPemain;
        this.jenisLapangan = jenisLapangan;
    }

    @Override
    public void Mulai() {
        System.out.println("Permainan Bola " + NamaPermainan + " dimulai dengan " + jumlahPemain + " pemain di lapangan " + jenisLapangan + ".");
    }

    public void Selesai(String pemenang) {
        System.out.println("Permainan Bola " + NamaPermainan + " selesai. Pemenang: " + pemenang);
    }

    public void DeskripsiLapangan() {
        System.out.println("Lapangan " + jenisLapangan + " adalah jenis lapangan " + NamaPermainan + ".");
    }
}

class Game extends Permainan {
    private String platform;
    private String level;

    public Game(String NamaPermainan, String platform, String level) {
        super(NamaPermainan);
        this.platform = platform;
        this.level = level;
    }

    @Override
    public void Selesai() {
        System.out.println("Permainan Game " + NamaPermainan + " selesai di platform " + platform + ".");
    }

    public void DeskripsiGame() {
        System.out.println("Permainan " + NamaPermainan + " adalah permainan dengan level " + level + ".");
    }

    public boolean CekKarakter(String karakter) {
        // Logika untuk memeriksa karakter dalam permainan
        return true; // Gantilah dengan logika sesuai permainan Anda
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di aplikasi permainan!");

        // Meminta nama permainan
        System.out.print("Masukkan nama permainan: ");
        String namaPermainan = scanner.nextLine();

        // Meminta jenis permainan (Bola atau Game)
        System.out.print("Pilih jenis permainan (1 untuk Bola, 2 untuk Game): ");
        int jenisPermainan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline di buffer

        if (jenisPermainan == 1) {
            // Meminta jumlah pemain untuk permainan Bola
            System.out.print("Masukkan jumlah pemain: ");
            int jumlahPemain = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline di buffer

            // Meminta jenis lapangan untuk permainan Bola
            System.out.print("Masukkan jenis lapangan (Rumput/Tanah/Beton): ");
            String jenisLapangan = scanner.nextLine();

            // Membuat objek Bola
            Bola bolaGame = new Bola(namaPermainan, jumlahPemain, jenisLapangan);

            // Memulai permainan
            bolaGame.Mulai();

            // Meminta pemenang permainan
            System.out.print("Masukkan nama pemenang: ");
            String pemenang = scanner.nextLine();

            // Mengakhiri permainan Bola dengan pemenang
            bolaGame.Selesai(pemenang);

            // Menampilkan deskripsi lapangan
            bolaGame.DeskripsiLapangan();
        } else if (jenisPermainan == 2) {
            // Meminta platform permainan Game
            System.out.print("Masukkan platform permainan: ");
            String platform = scanner.nextLine();

            // Meminta level permainan Game
            System.out.print("Masukkan level permainan (Easy/Medium/Hard): ");
            String level = scanner.nextLine();

            // Membuat objek Game
            Game videoGame = new Game(namaPermainan, platform, level);

            // Memulai permainan
            videoGame.Mulai();

            // Mengakhiri permainan Game
            videoGame.Selesai();

            // Menampilkan deskripsi permainan
            videoGame.DeskripsiGame();
        } else {
            System.out.println("Pilihan jenis permainan tidak valid.");
        }

        scanner.close();
    }
}