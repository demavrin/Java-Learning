// Inheritance (Kalıtım)
// Bir sınıfın başka bir sınıfın özelliklerini ve metotlarını miras almasıdır.
// extends anahtar kelimesi kullanılır.
// Amaç: Kod tekrarını azaltmak ve ortak özellikleri yeniden kullanmaktır.
package com.mycompany.inheritance;

/**
 *
 * @author demavrın    github : demavrin
 */
public class Inheritance {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        Ogretmen ogretmen = new Ogretmen();
        ogrenci.girisYap("admin", "1234");
        ogretmen.girisYap("admin", "1234");
        ogretmen.ogrencileriListele();
    }
}
