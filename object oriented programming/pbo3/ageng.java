
public class ageng {
    public static void main(String[] args) {
        int height = 7; // Tinggi pola huruf
 // Pindah ke baris berikutnya
        // Mencetak pola huruf C sampai Z
        for (int i = 0; i < height; i++) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                for (int j = 0; j < height; j++) {
                    switch (ch) {
						case 'A':
							if (i == 0 || i == height / 2 || j == 0 || j == height - 1) {
								System.out.print("A");
							} else {
								System.out.print(" ");
							}
							break;
						case 'B':
							if (i == 0 || i == height - 1 || j == 0 || j == height - 1 || (i == height / 2 && j < height / 2)) {
								System.out.print("B");
							} else {
								System.out.print(" ");
							}
							break;
                        case 'C':
                            if ((i == 0 || i == height - 1) && j > 0) {
                                System.out.print("C");
                            } else if (j == 0 && (i > 0 && i < height - 1)) {
                                System.out.print("C");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'D':
                            if ((i == 0 || i == height - 1) && j < height - 1) {
                                System.out.print("D");
                            } else if (j == 0 || j == height - 1) {
                                System.out.print("D");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'E':
                            if (i == 0 || i == height - 1 || j == 0 || (i == height / 2)) {
                                System.out.print("E");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        // Lanjutkan dengan huruf-huruf lainnya sesuai pola yang diinginkan
                        case 'F':
                          /*  if (i == 0 || i == height - 1 || j == 0 || (i == height / 2)) {
                                System.out.print("F");
                            } else {
                                System.out.print(" ");
                            }
							*/
							
			if ((i == 0) || (i == height / 2 && j <= height / 2))
				System.out.printf("*");
			else
				System.out.print(" ");
		}

                            break;
                        case 'G':
                            if ((i == 0 || i == height - 1) && j > 0) {
                                System.out.print("G");
                            } else if ((j == 0 || j == height - 1) && i > 0 && i < height / 2) {
                                System.out.print("G");
                            } else if (i == height / 2 && j >= height / 2) {
                                System.out.print("G");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        // Lanjutkan dengan huruf-huruf lainnya sesuai pola yang diinginkan
                        case 'H':
                            if (j == 0 || j == height - 1 || i == height / 2) {
                                System.out.print("H");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'I':
                            if (i == 0 || i == height - 1) {
                                System.out.print("I");
                            } else if (j == height / 2) {
                                System.out.print("I");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'J':
                            if (i == height - 1 && j < height - 1) {
                                System.out.print("J");
                            } else if (j == height - 1 && i < height - 1) {
                                System.out.print("J");
                            } else if (i >= height / 2 && j == 0) {
                                System.out.print("J");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'K':
                            if (j == 0 || (i == height / 2 && j >= height / 2) || (i + j == height - 1)) {
                                System.out.print("K");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        // Lanjutkan dengan huruf-huruf lainnya sesuai pola yang diinginkan
                        case 'L':
                            if (j == 0 || i == height - 1) {
                                System.out.print("L");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'M':
                            if (j == 0 || j == height - 1 || (i == j && i < height / 2) || (i + j == height - 1 && i < height / 2)) {
                                System.out.print("M");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'N':
                            if (j == 0 || j == height - 1 || i == j) {
                                System.out.print("N");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        // Lanjutkan dengan huruf-huruf lainnya sesuai pola yang diinginkan
                        case 'O':
                            if ((i == 0 || i == height - 1) && (j > 0 && j < height - 1)) {
                                System.out.print("O");
                            } else if ((j == 0 || j == height - 1) && (i > 0 && i < height - 1)) {
                                System.out.print("O");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'P':
                            if (i == 0 || j == 0 || j == height - 1 || (i == height / 2 && j < height / 2)) {
                                System.out.print("P");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'Q':
                            if ((i == 0 || i == height - 1) && (j > 0 && j < height - 1)) {
                                System.out.print("Q");
                            } else if ((j == 0 || j == height - 1) && (i > 0 && i < height - 1)) {
                                System.out.print("Q");
                            } else if (i > height / 2 && j > height / 2 && (i + j == height - 1)) {
                                System.out.print("Q");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'R':
                            if (i == 0 || j == 0 || j == height - 1 || (i == height / 2 && j < height / 2) || (i + j == height - 1 && i < height / 2)) {
                                System.out.print("R");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        // Lanjutkan dengan huruf-huruf lainnya sesuai pola yang diinginkan
                        case 'S':
                            if (i == 0 || i == height - 1 || i == height / 2 || (j == 0 && i <= height / 2) || (j == height - 1 && i >= height / 2)) {
                                System.out.print("S");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'T':
                            if (i == 0 || j == height / 2) {
                                System.out.print("T");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'U':
                            if ((i == 0 || i == height - 1) && j < height - 1) {
                                System.out.print("U");
                            } else if (j == 0 || j == height - 1) {
                                System.out.print("U");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'V':
                            if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && j == 6)
                                || (i == 6 && j == 0) || (i == 5 && j == 1) || (i == 4 && j == 2) || (i == 3 && j == 3) || (i == 2 && j == 4) || (i == 1 && j == 5) || (i == 0 && j == 6)) {
                                System.out.print("V");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'W':
                            if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && j == 6)
                                || (i == 6 && j == 0) || (i == 5 && j == 1) || (i == 4 && j == 2) || (i == 3 && j == 3) || (i == 2 && j == 4) || (i == 1 && j == 5) || (i == 0 && j == 6)) {
                                System.out.print("W");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'X':
                            if (i == j || i + j == height - 1) {
                                System.out.print("X");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'Y':
                            if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && j == 6) || (i == 1 && j == 5) || (i == 2 && j == 4) || (i == 3 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && j == 6)) {
                                System.out.print("Y");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                        case 'Z':
                            if (i == 0 || i == height - 1 || i + j == height - 1) {
                                System.out.print("Z");
                            } else {
                                System.out.print(" ");
                            }
                            break;
                    }
                }
                System.out.print("  "); // Spasi antara huruf
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}

