
package com.mycompany.yapicimetodlar;

/**
 *
 * @author demavrın
 */
public class Ogrenci {
    private String ad;
    private String soyad;
    private int okulNo;
    private int dogumYili;
    
    /*constructor yazıyorum yapcı method ozellıklerın altında yazılır genelde 
    public Ogrenci(){  //class ıle aynı ısımde olması lazım 
        //System.out.println("Yapıcı Blok calisti");
        this.ad =  "Girilmedi";
        this.soyad = "Girilmedi";
        this.okulNo = 0001;
        this.dogumYili = 2000;        
    } */
    
    public Ogrenci (String ad, String soyad, int okulNo, int dogumYili){    //parametrelı yapıcı method 
       this.ad =ad;
       this.soyad =soyad;
       this.okulNo = okulNo;
       this.dogumYili = dogumYili;
        System.out.println("Degerler aktarildi.");
    }
                                               
    public Ogrenci(){      //overloadıng methodu      parametresız de kullanabılırımım
        this.ad ="GR";
        this.soyad = "GR";
        this.okulNo =0;
        this.dogumYili=0000;
        System.out.println("Degerler varsayilan olarak  belirlendi");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }
       
    
}
