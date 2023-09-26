public class abcdef {
    public static void main(String[] args) {
        int size = 7; // Ukuran pola huruf 
        
        // Mencetak pola huruf A
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size / 2) && (j > 0 && j < size - 1)) {
                    System.out.print("A");
                } else if (i > 0 && i < size && (j == 0 || j == size - 1)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println(" ");
        
        // Mencetak pola huruf B
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || (i == size / 2 && j != size - 1) || (i != size / 2 && j == size - 1)) {
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println(" ");

        // Mencetak pola huruf C
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || (i == 0 || i == size - 1)) {
                    System.out.print("C");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println(" ");
        
        // Mencetak pola huruf D
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || (i == 0 || i == size - 1) && j < size - 1) {
                    System.out.print("D");
                } else if (j == size - 1 && i > 0 && i < size - 1) {
                    System.out.print("D");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println(" ");
        
        // Mencetak pola huruf E
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || (i == size / 2)) {
                    System.out.print("E");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println(" ");
        
        // Mencetak pola huruf F
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || (i == 0 || i == size / 2) && j < size - 1) {
                    System.out.print("F");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        System.out.println(" ");
    }
}