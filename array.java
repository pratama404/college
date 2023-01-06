public class array{
	public static void main(String[] args) {
		int [] usia = new int[10];
		usia [0] = 05;
		usia [1] = 10;
		usia [2] = 20;
		usia [3] = 30;
		usia [4] = 40;
		usia [5] = 50;
		usia [6] = 60;
		usia [7] = 70;
		usia [8] = 80;
		usia [9] = 90;

		for (int i = 0; i<usia.length; i++){
			if (usia[i]>=17){
				System.out.println("udah punya ktp");
			}else{
				System.out.println("belum ada ktp");
			}
		
		}
	}
}