public class array1{
	public static void main(String[] args) {
		/*static int diskon ( int harga[]) {
		return harga - (0.2 * harga);
	} */


		int [] harga = new int[10];
		harga [0] = 100000;
		harga [1] = 50000;
		harga [2] = 150000;
		harga [3] = 00000;
		harga [4] = 40;
		harga [5] = 50;
		harga [6] = 60;
		harga [7] = 70;
		harga [8] = 80;
		harga [9] = 90;

		for (int i = 0; i<harga.length; i++){
			int hargabaru = (harga[i] - (harga[i]*20)/100);
			System.out.println(hargabaru);
		
		}
	}
}