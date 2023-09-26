import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Jumlah akun bank yang akan dibuat: ");
            int numAccounts = input.nextInt();

            BankAccount[] accounts = new BankAccount[numAccounts];

            for (int i = 0; i < numAccounts; i++) {
                System.out.print("Masukkan saldo awal akun ke-" + (i + 1) + ": ");
                double initialBalance = input.nextDouble();

                accounts[i] = new BankAccount(initialBalance);
            }

            while (true) {
                System.out.println("\nPilihan Aksi:");
                System.out.println("1. Setor Uang");
                System.out.println("2. Tarik Uang");
                System.out.println("3. Cek Saldo");
                System.out.println("4. Keluar");

                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.print("Masukkan nomor akun (1-" + numAccounts + "): ");
                    int accountIndex = input.nextInt() - 1;

                    System.out.print("Masukkan jumlah yang akan disetor: ");
                    double depositAmount = input.nextDouble();

                    accounts[accountIndex].deposit(depositAmount);
                } else if (choice == 2) {
                    System.out.print("Masukkan nomor akun (1-" + numAccounts + "): ");
                    int accountIndex = input.nextInt() - 1;

                    System.out.print("Masukkan jumlah yang akan ditarik: ");
                    double withdrawAmount = input.nextDouble();

                    accounts[accountIndex].withdraw(withdrawAmount);
                } else if (choice == 3) {
                    System.out.print("Masukkan nomor akun (1-" + numAccounts + "): ");
                    int accountIndex = input.nextInt() - 1;

                    double balance = accounts[accountIndex].getBalance();
                    System.out.println("Saldo akun: " + balance);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }

            input.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
        }
    }
}
