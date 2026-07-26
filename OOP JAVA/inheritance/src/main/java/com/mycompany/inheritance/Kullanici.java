// Inheritance (Kalıtım)
// Bir sınıfın başka bir sınıfın özelliklerini ve metotlarını miras almasıdır.
// extends anahtar kelimesi kullanılır.
// Amaç: Kod tekrarını azaltmak ve ortak özellikleri yeniden kullanmaktır.
package com.mycompany.inheritance;

/**
 *
 * @author demavrın
 */
public class Kullanici {
    public String kullaniciAdi;
    public String sifre;
   
     public void girisYap(String kullaniciAdi, String sifre){
        if(kullaniciAdi.equals("admin")&& sifre.equals("1234")){
            System.out.println("giris basarili.");
          }else{
            System.out.println("giris basarisiz");
        }
    }
     
      public void mesajGonder(){
        System.out.println("mesaj gonderildi");   
    }
      
}
