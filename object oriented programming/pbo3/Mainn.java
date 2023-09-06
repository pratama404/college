public class Mainn {
    public static void main(String[] args) {
        // String Concatenation
        String name = "John Doe";
        String message = "Hello, " + name;
        System.out.println(message); // Output: Hello, John Doe

        // String Length
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Panjang string: " + length);

        // Array Manipulation
        int[] numbers = {10, 20, 30, 40, 50};
        int indexToRemove = 2;

        for (int i = indexToRemove; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        int[] newArray = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, newArray, 0, newArray.length);
        numbers = newArray;

        System.out.println("Array setelah menghapus elemen:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // String Case Conversion
        String strCase = "Hello, World!";
        String uppercaseStr = strCase.toUpperCase();
        String lowercaseStr = strCase.toLowerCase();
        System.out.println("Uppercase: " + uppercaseStr);
        System.out.println("Lowercase: " + lowercaseStr);

        // Check if a String contains only digits
        String str1 = "12345";
        String str2 = "12345a";
        boolean containsOnlyDigits1 = str1.matches("[0-9]+");
        boolean containsOnlyDigits2 = str2.matches("[0-9]+");
        System.out.println("str1 contains only digits: " + containsOnlyDigits1);
        System.out.println("str2 contains only digits: " + containsOnlyDigits2);

        // Substring
        String strSub = "Hello, World!";
        String substring1 = strSub.substring(7);
        String substring2 = strSub.substring(0, 5);
        System.out.println("Substring 1: " + substring1);
        System.out.println("Substring 2: " + substring2);

        // Remove Whitespace
        String strWhitespace = " Hello, World! ";
        String strWithoutWhitespace = strWhitespace.replaceAll("\\s", "");
        System.out.println("String setelah menghapus karakter kosong: " + strWithoutWhitespace);

        // Change Character Case
        String strChangeCase = "Hello, World!";
        int index = 7;
        char uppercaseChar = Character.toUpperCase(strChangeCase.charAt(index));
        String strUppercase = strChangeCase.substring(0, index) + uppercaseChar + strChangeCase.substring(index + 1);
        System.out.println("String setelah mengubah karakter menjadi huruf besar: " + strUppercase);
        char lowercaseChar = Character.toLowerCase(strChangeCase.charAt(index));
        String strLowercase = strChangeCase.substring(0, index) + lowercaseChar + strChangeCase.substring(index + 1);
        System.out.println("String setelah mengubah karakter menjadi huruf kecil: " + strLowercase);

        // Array Initialization and Access
        int[] numbers2 = new int[5];
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        System.out.println("Element pada indeks 2: " + numbers2[2]);
    }
}
