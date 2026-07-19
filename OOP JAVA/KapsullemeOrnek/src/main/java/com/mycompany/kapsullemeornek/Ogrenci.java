
package com.mycompany.kapsullemeornek;

/**
 *
 * @author demavrın
 */
public class Ogrenci {
    private String ad;
    private String soyad;
    private int okulNo;
    private int dogumYili;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
     if(ad.isEmpty()){
         System.out.println("Lutfen ogrenci adini giriniz.");
        
     }else{
         this.ad = ad;
     }   
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        if(soyad.isEmpty()){
         System.out.println("Lutfen ogrenci soyadini giriniz.");
        
     }else{
         this.soyad = soyad;
     } 
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        if(okulNo>1000){
            this.okulNo = okulNo;
        }else{
            System.out.println("Okul numarasini 1000 uzeri giriniz:");
        }
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        if(dogumYili>1900 && dogumYili<2020){
            this.dogumYili= dogumYili;
        }else{
            System.out.println("gecerli bir dogum tarihi giriniz:");
        }
    }
    
    
    
}
