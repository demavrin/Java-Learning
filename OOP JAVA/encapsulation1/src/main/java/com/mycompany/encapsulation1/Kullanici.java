package com.mycompany.encapsulation1;

/**
 *
 * @author demavrın Devran Turkoz
 */
public class Kullanici {
    // 4 adet özellik ekledim
    private String isim;
    private String soyisim;
    private int yas;
    private String email;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
            if(yas>0 && yas<100){
                this.yas =yas;
            }else{
                System.out.println("Dogru yas giriniz:");
            }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
    
    
   
    
    
  
    

 /*//private ozellıklere ulasmak ıcın gettır fonksıyon methodu kullanıyoruz 
    public String getIsim(){
        return isim;
    } 
    //private ozellıklere ulasmak ıcın settir fonksıyon methodu kullanıyoruz
    public void setIsim(String isim){
        this.isim = isim; //this.isim ise burdakı class ozellıktekı ısımdır */