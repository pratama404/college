import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat ArrayList dan menambahkan elemen ke dalamnya
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("ArrayList awal: " + fruits);

        // Insert elemen pada indeks tertentu
        fruits.add(1, "Grapes");
        System.out.println("Setelah insert Grapes pada indeks 1: " + fruits);

        // Update elemen pada indeks tertentu
        fruits.set(2, "Mango");
        System.out.println("Setelah update elemen pada indeks 2 menjadi Mango: " + fruits);

        // Hapus elemen pada indeks tertentu
        fruits.remove(0);
        System.out.println("Setelah menghapus elemen pada indeks 0: " + fruits);
    }
}
