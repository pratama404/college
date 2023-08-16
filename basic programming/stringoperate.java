public class stringoperate{
	public static void main(String[] args) {
		 String s = "hidup java";
		 String replace1 = s.replace("hidup", "java");
		 String replace2 = "java".replace("v","y");

		 System.out.println("ubah jadi kapital \t" +s.toUpperCase());
		 System.out.println("ubah huruf kecil \t" + s.toLowerCase());
		 System.out.println("ambil char posisi tertentu \t"+ s.charAt(3));
		 System.out.println("bersihkan akhir \t"+s.trim());
		 System.out.println("panggil substrim \t" + s.substring(1,5));
		 	System.out.println("panggil replace \t" + replace1 + " " + replace2);
		 	System.out.println("panggil indexOf \t" + s.indexOf("java"));

		 	String nama = "Ageng Putra Pratama";
		 	String singkatan = buatInisial(nama);
		 	System.out.println("nama "+ singkatan);
	}

	static String buatInisial(String nama){
	String inisial = " ";

	String[] sukuKata = nama.split(" ");

	for(int i=0; i<sukuKata.length; i++){
		inisial = inisial + sukuKata[i].substring(0,1);
	}
	return inisial;
  }
}
