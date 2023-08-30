public class OperatorLogika {
public static void main(String[] args) {
boolean isTrue = true;
boolean isFalse = false;
// Operator logika
boolean logicalAnd = isTrue && isFalse; // Apakah keduanya benar?
System.out.println("Logical AND: " + logicalAnd); // Output: false
boolean logicalOr = isTrue || isFalse; // Apakah salah satunya benar?
System.out.println("Logical OR: " + logicalOr); // Output: true
boolean logicalNot = !isTrue; // Negasi dari isTrue
System.out.println("Logical NOT: " + logicalNot); // Output: false


String username = "admin";
String password = "password";
// Operator logika
boolean isCredentialsValid = username.equals("admin") && password.equals("password");
System.out.println("Are Credentials Valid: " + isCredentialsValid); // Output: true
boolean isAnyFieldEmpty = username.isEmpty() || password.isEmpty();
System.out.println("Is Any Field Empty: " + isAnyFieldEmpty); // Output: false
boolean isUsernameValid = !username.equals("admin");
System.out.println("Is Username Valid: " + isUsernameValid); // Output: false
}
}