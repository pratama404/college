public class uniq {
    public static void main(String[] args) {
        String name = "Ageng Putra Pratama";

        // Huruf Kapital
        System.out.println("1. Huruf Kapital:");
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.print(Character.toUpperCase(letter) + " ");
        }
        System.out.println();

        // Diagonal
        System.out.println("2. Diagonal:");
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            char letter = name.charAt(i);
            System.out.println(letter);
        }

        // Balik
        System.out.println("3. Balik:");
        for (int i = name.length() - 1; i >= 0; i--) {
            char letter = name.charAt(i);
            System.out.print(letter);
        }
        System.out.println();

        // Tumpukan Vertikal
        System.out.println("4. Tumpukan Vertikal:");
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println(letter);
        }
    }
}
