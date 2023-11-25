import java.util.*;
import java.util.Iterator;

public class CollectionCRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        // LinkedList
        List<String> linkedList = new LinkedList<>();
        // HashSet
        Set<String> hashSet = new HashSet<>();
        // TreeSet
        Set<String> treeSet = new TreeSet<>();

        int choice;
        do {
            System.out.println("Pilih koleksi:");
            System.out.println("1. ArrayList");
            System.out.println("2. LinkedList");
            System.out.println("3. HashSet");
            System.out.println("4. TreeSet");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Membaca newline character

            switch (choice) {
                case 1:
                    handleCollectionOperations(arrayList, "ArrayList", scanner);
                    break;
                case 2:
                    handleCollectionOperations(linkedList, "LinkedList", scanner);
                    break;
                case 3:
                    handleCollectionOperations(hashSet, "HashSet", scanner);
                    break;
                case 4:
                    handleCollectionOperations(treeSet, "TreeSet", scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void handleCollectionOperations(Collection<String> collection, String collectionName, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nOperasi untuk " + collectionName + ":");
            System.out.println("1. Create (Tambah data)");
            System.out.println("2. Insert (Tambah data pada indeks tertentu)");
            System.out.println("3. Update (Edit data)");
            System.out.println("4. Delete (Hapus data)");
            System.out.println("5. Tampilkan data");
            System.out.println("0. Kembali ke menu utama");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Membaca newline character

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data yang akan ditambahkan: ");
                    String data = scanner.nextLine();
                    collection.add(data);
                    System.out.println("Data telah ditambahkan ke " + collectionName);
                    break;
                case 2:
                    System.out.print("Masukkan data yang akan ditambahkan: ");
                    String dataToInsert = scanner.nextLine();
                    System.out.print("Masukkan indeks: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();  // Membaca newline character
                    if (index >= 0 && index <= collection.size()) {
                        if (collection instanceof List) {
                            List<String> list = (List<String>) collection;
                            list.add(index, dataToInsert);
                            System.out.println("Data telah ditambahkan pada indeks " + index + " di " + collectionName);
                        } else {
                            System.out.println("Operasi 'Insert' tidak didukung pada " + collectionName);
                        }
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan indeks elemen yang akan diubah: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();  // Membaca newline character
                    if (updateIndex >= 0 && updateIndex < collection.size()) {
                        System.out.print("Masukkan data baru: ");
                        String newData = scanner.nextLine();
                        if (collection instanceof List) {
                            List<String> list = (List<String>) collection;
                            list.set(updateIndex, newData);
                            System.out.println("Data pada indeks " + updateIndex + " telah diupdate di " + collectionName);
                        } else {
                            System.out.println("Operasi 'Update' tidak didukung pada " + collectionName);
                        }
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan indeks elemen yang akan dihapus: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine();  // Membaca newline character
                    if (deleteIndex >= 0 && deleteIndex < collection.size()) {
                        Iterator<String> iterator = collection.iterator();
                        for (int i = 0; i <= deleteIndex; i++) {
                            iterator.next();
                        }
                        iterator.remove();
                        System.out.println("Data pada indeks " + deleteIndex + " telah dihapus dari " + collectionName);
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                    break;
                case 5:
                    System.out.println("Data dalam " + collectionName + ":");
                    for (String item : collection) {
                        System.out.println(item);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);
    }
}
