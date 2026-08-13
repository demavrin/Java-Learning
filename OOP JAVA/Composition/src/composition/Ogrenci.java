
package composition;

/**
 *
 * @author github: demavrın
 */
public class Ogrenci {
    public String ad;
    public String soyAd;
    public String numara;
    public String babaAdi;
    public String anaAdi;
    public String dogumTarihi;

    //constructur ekledım ınsret code sag clıck 
    public Ogrenci(String ad, String soyAd, String numara, String babaAdi, String anaAdi, String dogumTarihi) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.numara = numara;
        this.babaAdi = babaAdi;
        this.anaAdi = anaAdi;
        this.dogumTarihi = dogumTarihi;
    }
    
}
