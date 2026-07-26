package com.mycompany.inheritance;

/**
 *
 * @author demavrın
 */
public class Ogretmen extends Kullanici{
    public int ogretmenNO;
    public double puan;
    public int bakiye;
    
    public void ogrencileriListele(){
        System.out.println("ogrenciler listelendi");
    }
    
    public void paraCek(int miktar){
        this.bakiye = this.bakiye - miktar;
        System.out.println("para cekildi" +this.bakiye);
    }
}

