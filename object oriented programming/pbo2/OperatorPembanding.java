public class OperatorPembanding {
public static void main(String[] args) {
int x = 5;
int y = 10;
// Operator pembanding
boolean isEqual = (x == y); // Apakah x sama dengan y?
System.out.println("Is Equal: " + isEqual); // Output: false
boolean isGreaterThan = (x > y); // Apakah x lebih besar dari y?
System.out.println("Is Greater Than: " + isGreaterThan); // Output: false
boolean isLessThan = (x < y); // Apakah x lebih kecil dari y?
System.out.println("Is Less Than: " + isLessThan); // Output: true

String name1 = "John";
String name2 = "John";
String name3 = "Jane";
// Operator pembanding
boolean isEqual1 = name1.equals(name2); // Apakah name1 sama dengan name2?
System.out.println("Is Equal 1: " + isEqual1); // Output: true
boolean isEqual2 = name1.equals(name3); // Apakah name1 sama dengan name3?
System.out.println("Is Equal 2: " + isEqual2); // Output: false
}
}