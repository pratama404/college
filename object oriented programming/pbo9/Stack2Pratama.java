import java.util.*;

class Stack {
    private List<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void insert(int num) {
        stack.add(num);
    }

    public void update(Scanner scanner) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Tidak ada data yang bisa di-update.");
        } else {
            System.out.print("Masukkan data yang ingin di-update: ");
            int dataToUpdate = scanner.nextInt();

            if (stack.contains(dataToUpdate)) {
                System.out.print("Masukkan data yang baru: ");
                int newData = scanner.nextInt();

                for (int i = 0; i < stack.size(); i++) {
                    if (stack.get(i) == dataToUpdate) {
                        stack.set(i, newData);
                    }
                }

                System.out.println("Data berhasil di-update.");
            } else {
                System.out.println("Data tidak ditemukan dalam stack.");
            }
        }
    }

    public void delete(Scanner scanner) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Tidak ada data yang bisa dihapus.");
        } else {
            System.out.print("Masukkan data yang akan dihapus: ");
            int dataToDelete = scanner.nextInt();

            if (stack.contains(dataToDelete)) {
                int indexToDelete = stack.indexOf(dataToDelete);
                stack.remove(indexToDelete);
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Data tidak ditemukan dalam stack.");
            }
        }
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements:");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        }
    }
}

public class Stack2Pratama {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.insert(5);
        stack.insert(2);
        stack.insert(3);
		stack.insert(4);
		
        System.out.println("Data saat ini:");
        stack.display();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data yang akan di-insert: ");
                    int dataToInsert = scanner.nextInt();
                    stack.insert(dataToInsert);
                    System.out.println("Data berhasil di-insert.");
                    break;
                case 2:
                    stack.update(scanner);
                    break;
                case 3:
                    stack.delete(scanner);
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
