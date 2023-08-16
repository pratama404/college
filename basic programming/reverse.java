import java.util.*;

public class reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String hasil ="";

		System.out.println("input");
		String input = scan.nextLine();

		int jumlah = input.length();
		int jumlahhuruf = jumlah -1 ;

		for (int i = 0; i< jumlah; i++){
			hasil = hasil +input.charAt(jumlahhuruf);
			jumlahhuruf --;
		}
		System.out.println("hasilmu " + hasil);
	}
}
