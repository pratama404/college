import java.util.Scanner;

public class SoalJoko {
    public static void main(String[] args) {
        boolean checkBulan = false, checkTahun = false;
        int t = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hallo Joko!");
        while (!checkBulan) {
            System.out.print("Masukkan Indeks Bulan(1-12): ");
            b = scan.nextInt();
            if (b > 0 && b <= 12) {
                checkBulan = true;
            }
        }
        while (!checkTahun) {
            System.out.print("Masukkan Tahun(>0): ");
            t = scan.nextInt();
            if (t > 0) {
                checkTahun = true;
            }
        }

        System.out.println(resultProcess(b, t));
    }

    private static String resultProcess(int bulan, int tahun) {
        return getMonthName(bulan) + " tahun " + tahun + ", " + getMonthDays(bulan, tahun) + " hari";
    }

    private static boolean checkKabisat(int tahun) {
        if (tahun % 4 == 0) {
            return true;
        }
        return false;
    }

    private static int getMonthDays(int bulan, int tahun) {
        if (checkKabisat(tahun)) {
            if (bulan == 2) {
                return 29;
            } else {
                return 28;
            }
        } else {
            switch (bulan) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                default:
                    return 30;
            }
        }
    }

    private static String getMonthName(int bulan) {
        switch (bulan) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            default:
                return "Desember";
        }
    }
}