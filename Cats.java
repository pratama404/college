public class Cats{
	public static void main(String[] args) {
		
		String[][] cats = {{"terry", "brown"},{"kitty","white"},{"toby", "gray"}, {"fido","john"}};

		String[][] dogs = {{"milo", "archie", "olie"},{"luna", "coco", "bombom"},{"molly", "lucy", "caldo"}};


		cetak2d(cats);
		cetak2d(dogs);
		/*System.out.println(cats[0][0]);
		System.out.println(cats[0][1]);
		System.out.println(cats[1][0]);
		System.out.println(cats[1][1]);
		System.out.println(cats[2][0]);
		System.out.println(cats[2][1]);
		System.out.println(cats[3][0]);
		System.out.println(cats[3][1]);*/








		/*for(int baris=0; baris<4; baris++){
			for (int kolom=0; kolom<2; kolom++){
				//System.out.println(cats[baris][kolom]);
				System.out.print(cats[baris][kolom]+" ");
			}
			System.out.println();
		}*/
	}


	public static void cetak2d (String [][] myArray){
		for(int baris=0; baris<myArray.length; baris++){
			for (int kolom=0; kolom<myArray[baris].length; kolom++){
				System.out.print(myArray[baris][kolom]+" ");
			}
			System.out.println();
		}
	}
}