import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPratama {
    public static void main(String[] args) {
        List<MyObject> objectList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Data awal
        objectList.add(new MyObject("laptop", 10));
        objectList.add(new MyObject("tas", 20));
        objectList.add(new MyObject("buku", 30));

        int choice;

        // Menampilkan data awal sebelum memilih menu
        System.out.println("Data saat ini:");
        displayList(objectList);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama objek: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nilai objek: ");
                    int value = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    objectList.add(new MyObject(name, value));
                    System.out.println("Data berhasil di-insert.");
                    break;
                case 2:
                    System.out.print("Masukkan indeks data yang akan di-update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    if (indexToUpdate >= 0 && indexToUpdate < objectList.size()) {
                        System.out.print("Masukkan nama baru: ");
                        String newName = scanner.nextLine();
                        System.out.print("Masukkan nilai baru: ");
                        int newValue = scanner.nextInt();
                        scanner.nextLine(); // Mengonsumsi newline
                        MyObject updatedObject = new MyObject(newName, newValue);
                        objectList.set(indexToUpdate, updatedObject);
                        System.out.println("Data berhasil di-update.");
                    } else {
                        System.out.println("Indeks tidak valid!");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan indeks data yang akan dihapus: ");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    if (indexToDelete >= 0 && indexToDelete < objectList.size()) {
                        objectList.remove(indexToDelete);
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Indeks tidak valid!");
                    }
                    break;
                case 4:
                    // Menampilkan data sebelum dan setelah modifikasi saat memilih "Display"
                    System.out.println("\nData awal:");
                    displayInitialData();
                    System.out.println("\nData saat ini:");
                    displayList(objectList);
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void displayList(List<MyObject> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Indeks " + i + ": " + list.get(i).getName() + " - " + list.get(i).getValue());
        }
    }

    public static void displayInitialData() {
        System.out.println("Data awal:");
        System.out.println("Indeks 0: laptop - 10");
        System.out.println("Indeks 1: tas - 20");
        System.out.println("Indeks 2: buku - 30");
    }
}

class MyObject {
    private String name;
    private int value;

    public MyObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}





