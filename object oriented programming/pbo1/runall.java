/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author ageng
 */
public class runall {
    public static void main(String[] args) {
        // Membuat objek mobil merah dari kelas mobil
        mobil mobilMerah = new mobil();
        
        // Mengatur atribut objek "mobilMerah"
        mobilMerah.setMerek("Toyota");
        mobilMerah.setWarna("Merah");
    
        // Memanggil metode pada objek "mobilMerah"
        mobilMerah.maju();
        mobilMerah.mundur();
        
        // Membuat objek mobilsport
        mobilsport lambo = new mobilsport();
    
        lambo.setMerek("Lamborghini");
        lambo.setWarna("Merah");
        lambo.setKecepatanMaksimal(217);
        lambo.maju();
        lambo.mundur();
        lambo.turbo();
        
        // Membuat objek bahagia dan subkelasnya
        bahagia obj1 = new bahagia();
        BahagiaSekali obj2 = new BahagiaSekali();
        BahagiaTapiLelah obj3 = new BahagiaTapiLelah();
        
        obj1.ucapan();
        obj2.ucapan();
        obj3.ucapan();
        
        obj1.ucapan("saya berhasil");
        obj2.ucapan("karena makan");
        obj3.ucapan("saya baru sembuh");
    }
}
