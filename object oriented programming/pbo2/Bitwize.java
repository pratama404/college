import java.math.BigInteger;

public class Bitwize {
public static void main(String[] args) {
int a = 5; // 0101
int b = 3; // 0011
// Operator bitwise AND
int resultAnd = a & b; // 0001
System.out.println("Bitwise AND: " + resultAnd); // Output: 1
// Operator bitwise OR
int resultOr = a | b; // 0111
System.out.println("Bitwise OR: " + resultOr); // Output: 7
// Operator bitwise XOR
int resultXor = a ^ b; // 0110
System.out.println("Bitwise XOR: " + resultXor); // Output: 6
// Operator bitwise NOT
int resultNot = ~a; // 1010
System.out.println("Bitwise NOT: " + resultNot); // Output: -6
// Operator bitwise left shift
int resultLeftShift = a << 2; // 010100
System.out.println("Bitwise Left Shift: " + resultLeftShift); // Output: 20
// Operator bitwise right shift
int resultRightShift = a >> 1; // 0010
System.out.println("Bitwise Right Shift: " + resultRightShift); // Output: 2

BigInteger bigInteger1 = new BigInteger("12345678901234567890");
BigInteger bigInteger2 = new BigInteger("98765432109876543210");
// Operator bitwise AND
BigInteger resultand = bigInteger1.and(bigInteger2);
System.out.println("Bitwise AND: " + resultand); 
// Operator bitwise OR
BigInteger resultor = bigInteger1.or(bigInteger2);
System.out.println("Bitwise OR: " + resultor); 
// Operator bitwise XOR
BigInteger resultxor = bigInteger1.xor(bigInteger2);
System.out.println("Bitwise XOR: " + resultxor); 
// Operator bitwise NOT
BigInteger resultnot = bigInteger1.not();
System.out.println("Bitwise NOT: " + resultnot); 
// Operator bitwise left shift
BigInteger resultleftshift = bigInteger1.shiftLeft(2);
System.out.println("Bitwise Left Shift: " + resultleftshift);
// Operator bitwise right shift
BigInteger resultrightshift = bigInteger1.shiftRight(1);
System.out.println("Bitwise Right Shift: " + resultrightshift); 
}
}