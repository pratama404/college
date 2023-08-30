import java.time.LocalDate;
public class hari {
public static void main(String[] args) {
// Membuat objek LocalDate dengan tanggal sekarang
LocalDate currentDate = LocalDate.now();
// Menampilkan tanggal saat ini
System.out.println("Current Date: " + currentDate);
// Mengubah tanggal
LocalDate modifiedDate = currentDate.plusDays(7); // Menambah 7 hari ke tanggal saat ini
// Menampilkan tanggal yang diubah
System.out.println("Modified Date: " + modifiedDate);
}
}
