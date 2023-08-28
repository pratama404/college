/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author ageng
 */
public class bahagia {
    public void ucapan() {
        System.out.println( " Saya merasa bahagia! ");
    }
    public void ucapan(String x){
        System.out.println( " saya merasa bahagia karena " + x);
    }
}
class BahagiaSekali extends bahagia {
    
    @Override
    public void ucapan (){
        System.out.println( " Saya merasa bahagia sekali");
    }
}

class BahagiaTapiLelah extends bahagia {
    
    @Override
    public void ucapan (){
        System.out.println( " Saya merasa bahagia tapi lelah");
    }
}
class Main{
    public static void main(String[] args){
        bahagia obj1 = new bahagia();
        bahagia obj2 = new BahagiaSekali();
        bahagia obj3 = new BahagiaTapiLelah();
        obj1.ucapan();
        obj2.ucapan();
        obj3.ucapan();
        
        obj1.ucapan("saya berhasil ");
        obj2.ucapan( "karena makan ");
        obj3.ucapan("saya baru sembuh ");
        
        
    }
}

