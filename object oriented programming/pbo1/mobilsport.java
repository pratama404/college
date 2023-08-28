/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author ageng
 */
public class mobilsport extends mobil{
    // Atribut tambahan
    private int kecepatanMaksimal;
    
    //metode tambahan
    public void setKecepatanMaksimal(int kecepatan){
        kecepatanMaksimal = kecepatan;
    }
    public int getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }
    
    //metode tambahan untuk kelas subkelas
    public void turbo() {
        System.out.println( "Mobil sport sedang menggunakan turbo " + "dengan kecepatan " + kecepatanMaksimal);
    }
    public static void main(String[] ntah) {
        mobilsport lambo = new mobilsport();
    
       lambo.setMerek("Lamborghini");
        lambo.setWarna( "Merah");
        lambo.setKecepatanMaksimal(217);
        lambo.maju();
        lambo.mundur();
        lambo.turbo();
        
    }
}