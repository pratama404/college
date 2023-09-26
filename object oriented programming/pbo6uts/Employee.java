import java.util.Scanner;

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double calculateYearlySalary() {
        return 12 * monthlySalary;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Jumlah karyawan yang akan diinput: ");
            int numEmployees = input.nextInt();

            Employee[] employees = new Employee[numEmployees];

            for (int i = 0; i < numEmployees; i++) {
                System.out.print("Masukkan nama karyawan ke-" + (i + 1) + ": ");
                String name = input.next();

                System.out.print("Masukkan gaji bulanan karyawan ke-" + (i + 1) + ": ");
                double monthlySalary = input.nextDouble();

                employees[i] = new Employee(name, monthlySalary);
            }

            System.out.println("\nGaji Tahunan Karyawan:");
            for (int i = 0; i < numEmployees; i++) {
                double yearlySalary = employees[i].calculateYearlySalary();
                System.out.println("Karyawan ke-" + (i + 1) + ": " + employees[i].name + " - Gaji Tahunan: " + yearlySalary);
            }

            input.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
        }
    }
}
