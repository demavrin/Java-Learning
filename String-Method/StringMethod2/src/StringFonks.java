


public class StringFonks {
    public static void main(String[] args) {
      String metin = "demavrin";
    // STRİNG ASLİNDA CHAR DİZİSİ  char[] metin = {'d','E','M','A','V','R','İ','N'};
        String isim = "Devran Turkoz";

        System.out.println(isim.charAt(3));
        System.out.println(isim.indexOf("T"));

        System.out.println(isim.substring(0,3)); //bellı bır yerden baslayıp bıtırıyor

        System.out.println(isim.contains("Turkoz")); //bu method hıc bır yerde Turkoz var mı aramak ıcın

        isim = "devo mavrin"; //dıyelımkı soyısım degısmesı lazım projede ılerde

        isim = isim.replace("mavrin", "Turkoz");
        System.out.println(isim);

        String cumle = "ne mutlu turkum diyene!";
        String[] kelimeler = cumle.split(" ");
        System.out.println(kelimeler[0]);
        System.out.println(kelimeler[1]);
        System.out.println(kelimeler[2]);
        System.out.println(kelimeler[3]);

    }
}
