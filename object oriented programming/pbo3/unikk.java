public class unikk {
    public static void main(String[] args) {
        String name = "Ageng Putra Pratama";

        // Daftar bentuk unik untuk setiap huruf
        char[] uniqueShapes = {
            'A', '@', 'G', '&', 'E', '%', 'N', '#', ' ', 'P', 'U', 'T', 'R', '*', 'M'
        };

        // Cetak nama dengan bentuk unik
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int index = Character.toUpperCase(letter) - 'A';

            if (index >= 0 && index < uniqueShapes.length) {
                System.out.print(uniqueShapes[index]);
            } else {
                System.out.print(letter);
            }
        }
        System.out.println();
    }
}
