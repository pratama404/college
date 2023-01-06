import java.util.*;
public class nf3 {
	public static void main(String[] args) {
		Scanner bi = new Scanner(System.in);		System.out.print("Harga Rumah (Juta) :");
		int ru = bi.nextInt();
		System.out.print("Tabungan Awal (Juta) :");
		int ta = bi.nextInt();
		System.out.print("Tabungan perbulan (Juta) :");
		int tt = bi.nextInt();
		while (ta  <=ru+ tt-1 ){
			System.out.print(ta);
			ta+=tt;
		}
	}
}