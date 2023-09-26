import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan panjang persegi panjang: ");
            double length = input.nextDouble();

            System.out.print("Masukkan lebar persegi panjang: ");
            double width = input.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);
            double area = rectangle.calculateArea();
            double perimeter = rectangle.calculatePerimeter();

            System.out.println("Luas persegi panjang: " + area);
            System.out.println("Keliling persegi panjang: " + perimeter);

            input.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
        }
    }
}