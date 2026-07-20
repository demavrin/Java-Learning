package com.mycompany.tostringmetodu;

/**
 *
 * @author demavrın
 */
public class ToStringMetodu {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd("Devran");
        ogrenci.setSoyad("Turkoz");
        ogrenci.setOkulNo(214543656);
        ogrenci.setDogumYili(2000);
        //System.out.println(ogrenci.getAd()); //bunları tek tek yazmak yerıne method yazıcam
        System.out.println(ogrenci);
    }
    //toString methodu
    
}
