
package composition;

/**
 *
 * @author github: demavrın
 */
public class Ogrenciislemleri {
     public Ogrenci ogrenci;
     
    public Ogrenciislemleri(Ogrenci ogrenci) { //parametre olarak Ogrencı classından al 
        this.ogrenci = ogrenci;
    }
     public void ekle(){
         System.out.println("ogrneci eklendı"+ogrenci.ad);
     }
     public void sil(){
         System.out.println("ogrenci silindi"+ogrenci.numara);
     }
     public void bilgileriGoster(){
         System.out.println(ogrenci.ad);
         System.out.println(ogrenci.soyAd);
         System.out.println(ogrenci.dogumTarihi);
         System.out.println(ogrenci.numara);
         System.out.println(ogrenci.anaAdi);
         System.out.println(ogrenci.babaAdi);
     }
}
