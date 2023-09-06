import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bab4ke2 {
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
        Integer[] numbers = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        Integer[] result = uniqueNumbers.toArray(new Integer[0]);
        System.out.println("Array hasil: " + Arrays.toString(result));

        // Jumlah Elemen dalam Array
        int[] arr = {1, 2, 3, 4, 5};
        int jumlahElemen = arr.length;
        System.out.println("Jumlah elemen dalam array: " + jumlahElemen);

        // Array Dua Dimensi
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * 3 + j + 1;
            }
        }

        System.out.println("Array Dua Dimensi:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Array Dua Dimensi String
        String[][] names = new String[2][3];
        names[0][0] = "John";
        names[0][1] = "Emma";
        names[0][2] = "Michael";
        names[1][0] = "Sophia";
        names[1][1] = "William";
        names[1][2] = "Olivia";

        System.out.println("Array Dua Dimensi String:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        // Array Tiga Dimensi
        int[][][] cube = new int[3][3][3];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = i + j + k;
                }
            }
        }

        System.out.println("Array Tiga Dimensi:");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Perkalian Matriks
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Hasil Perkalian Matriks:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] result = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
