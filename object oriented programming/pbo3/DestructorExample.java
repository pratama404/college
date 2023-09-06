public class DestructorExample {
public static void main(String[] args) {
DestructorExample obj = new DestructorExample();
// Menghapus referensi objek
obj = null;
// Meminta Garbage Collector untuk membersihkan objek
System.gc();
}
@Override
protected void finalize() throws Throwable {
try {
// Tindakan terakhir sebelum objek dihapus
System.out.println("Metode finalize() dipanggil");
} finally {
super.finalize();
}
}
}