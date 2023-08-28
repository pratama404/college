/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author ageng
 */
public class mobil {
    private String merek;
    private String warna;
    public void setMerek(String merek){
    this.merek = merek;
    }
    
    //Metode setter
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    //Metode Getter
    public String getMerek(){
        return merek;
    }
    public String getWarna (){
        return warna;
    }
    
    //metode lain
    public void maju(){
        System.out.println("Mobil "+ merek +"  berwarna "+ warna +" sedang maju. ");
    }
    public void mundur(){
        System.out.println("Mobil "+ merek +"  berwarna "+ warna +" sedang mundur. ");
    }
    public static void main(String[] args){
         //membuat objek mobil merah dari kelas mobil
        mobil mobilMerah = new mobil();
        
         //Mengatur atribut objek "mobilMerah"
        mobilMerah.setMerek("Toyota");
        mobilMerah.setWarna("Merah");
    
        //Memanggil metode pada objek "mobilmerah"
        mobilMerah.maju(); //output: Mobil Toyota berwarna Merah sedang maju.
        mobilMerah.mundur(); //output: Mobil Toyota berwarna Merah sedang mundur.
        
        //Mengakses atribut objek "mobilMerah" menggunakan metode getter
        System.out.println("Merek mobil: " + mobilMerah.getMerek()); //output: Merek mobil: Toyota
        System.out.println("Warna mobil: " + mobilMerah.getWarna()); //output: Warna mobil: Merah
    }
}