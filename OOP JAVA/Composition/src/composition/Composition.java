package composition;
// bır sınıfın dıger sınıfının kullanılması denır composıtıon 
/**
 *
 * @author github: demavrın
 */
public class Composition {

  
    public static void main(String[] args) {
      Ogrenci ogrenci  = new Ogrenci
        ("Devran" , "Turkoz" , "777" , "aslan", "Vala" ,"17.02.2000"); 
      Ogrenciislemleri ogrenciislemleri = new Ogrenciislemleri(ogrenci);
      ogrenciislemleri.ekle();
      
      
      
    }
    
}
