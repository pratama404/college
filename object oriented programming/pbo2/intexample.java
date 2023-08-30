public class intexample {
public static void main(String[] args) {
// Membuat objek Integer
Integer number = new Integer(10);
// Menampilkan nilai Integer
System.out.println("Number: " + number);

// Menggunakan metode dan perilaku Integer
int doubledNumber = number.intValue() * 2; 
System.out.println("Doubled Number: " + doubledNumber);

// Menggunakan metode statis pada Integer
int parsedNumber = Integer.parseInt("20"); 
System.out.println("Parsed Number: " + parsedNumber);
}
}
