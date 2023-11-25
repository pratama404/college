import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AgengFruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Menambahkan data ke dalam ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Menampilkan data menggunakan Iterator
        Iterator<String> iterator = fruits.iterator();
        System.out.print("Data buah: ");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();  // Baris baru

        // Menyisipkan data
        System.out.print("Masukkan buah yang ingin Anda sisipkan: ");
        String fruitToInsert = scanner.nextLine();
        System.out.print("Masukkan posisi sisipan (indeks): ");
        int insertIndex = scanner.nextInt();

        if (insertIndex >= 0 && insertIndex <= fruits.size()) {
            fruits.add(insertIndex, fruitToInsert);
        } else {
            System.out.println("Posisi sisipan tidak valid.");
        }
        
        // Menampilkan data setelah sisipan
        iterator = fruits.iterator();
        System.out.print("Data setelah sisipan: ");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();  // Baris baru
        
        // Mengedit data (mengganti "Banana" dengan "Pineapple")
        int indexToEdit = fruits.indexOf("Banana");
        if (indexToEdit != -1) {
            fruits.set(indexToEdit, "Pineapple");
        }
        
        // Menghapus data (menghapus "Orange")
        fruits.remove("Orange");
        
        // Menampilkan data setelah mengedit dan menghapus
        iterator = fruits.iterator();
        System.out.print("Data setelah mengedit dan menghapus: ");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();  // Baris baru
        
        scanner.close(); // Jangan lupa menutup scanner
    }
}