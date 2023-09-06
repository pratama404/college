public class VerticalNamePattern {
    static int height = 5; // Ubah tinggi sesuai kebutuhan

    static void printA() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if ((j == 0 || j == height) || (i == 0 && j > 0 && j < height) || (i == height / 2 && j > 0 && j < height)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printG() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if ((j == 0 || j == height) && (i != 0 && i != height - 1) || (i == 0 && j > 0 && j < height) || (i == height - 1 && j > height / 2) || (j == height / 2 && i >= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printE() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if ((j == 0 || j == height) || (i == 0 || i == height / 2 || i == height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printN() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == 0 || j == height || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printP() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == 0 || (i == 0 || i == height / 2) && j < height || (j == height && i > 0 && i < height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printU() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if ((j == 0 || j == height) && i != height - 1 || (i == height - 1 && j > 0 && j < height)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printT() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (i == 0 || j == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printR() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == 0 || (i == 0 || i == height / 2) && j < height || (j == height && i > 0 && i < height / 2) || (i == i && j == i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printAsterisk() {
        for (int i = 0; i < height; i++) {
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        char[] characters = {'A', 'G', 'E', 'N', 'G', 'P', 'U', 'T', 'R', 'A', 'P', 'R', 'A', 'T', 'A', 'M', 'A'};
        int spaceCount = 2; // Jarak antara huruf
        for (char character : characters) {
            switch (character) {
                case 'A':
                    printA();
                    break;
                case 'G':
                    printG();
                    break;
                case 'E':
                    printE();
                    break;
                case 'N':
                    printN();
                    break;
                case 'P':
                    printP();
                    break;
                case 'U':
                    printU();
                    break;
                case 'T':
                    printT();
                    break;
                case 'R':
                    printR();
                    break;
                default:
                    printAsterisk();
                    break;
            }
            // Tambahkan spasi antara huruf
            for (int i = 0; i < spaceCount; i++) {
                System.out.println();
            }
        }
    }
}
