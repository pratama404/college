import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class XPatternExample {
    public static void main(String[] args) {
        int size = 7; // Ukuran pola huruf X
        // Mencetak pola huruf X
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        size = 7; // Ukuran pola huruf Z
        // Mencetak pola huruf Z
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == size - j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        size = 7; // Ukuran pola huruf Q
        // Mencetak pola huruf Q
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && (j > 0 && j < size - 1)) {
                    System.out.print("*");
                } else if ((i > 0 && i < size - 1) && (j == 0 || j == size - 1)) {
                    System.out.print("*");
                } else if (i == size - 2 && j == size - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        size = 6; // Ukuran pola huruf A
        // Mencetak pola huruf A
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size / 2; j++) {
                if (i == 0 && j != size / 2) {
                    System.out.print(" ");
                } else if (i == 0 || j == size / 2) {
                    System.out.print("*");
                } else if (i == size / 2) {
                    System.out.print("*");
                } else if (j == 0 || j == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        size = 7; // Ukuran pola huruf C
        // Mencetak pola huruf C
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && (j > 0 && j < size - 1)) {
                    System.out.print("*");
                } else if (i > 0 && i < size - 1 && j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        int length = array1.length + array2.length + array3.length;
        int[] result = new int[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        System.arraycopy(array3, 0, result, array1.length + array2.length, array3.length);
        // Cetak hasil
        for (int num : result) {
            System.out.print(num + " ");
        }

        Integer[] array1Integer = {1, 2, 3};
        Integer[] array2Integer = {4, 5, 6};
        Integer[] array3Integer = {7, 8, 9};
        ArrayList<Integer> resultList = new ArrayList<>();
        Collections.addAll(resultList, array1Integer);
        Collections.addAll(resultList, array2Integer);
        Collections.addAll(resultList, array3Integer);
        // Ubah ArrayList menjadi array
        Integer[] resultInteger = resultList.toArray(new Integer[resultList.size()]);
        // Cetak hasil
        for (int num : resultInteger) {
            System.out.print(num + " ");
        }
    }
}