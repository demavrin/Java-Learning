/*
 *  ██████╗ ███████╗██╗   ██╗██████╗  █████╗ ███╗   ██╗
 *  ██╔══██╗██╔════╝██║   ██║██╔══██╗██╔══██╗████╗  ██║
 *  ██║  ██║█████╗  ██║   ██║██████╔╝███████║██╔██╗ ██║
 *  ██║  ██║██╔══╝  ╚██╗ ██╔╝██╔══██╗██╔══██║██║╚██╗██║
 *  ██████╔╝███████╗ ╚████╔╝ ██║  ██║██║  ██║██║ ╚████║
 *  ╚═════╝ ╚══════╝  ╚═══╝  ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝
 *
 *  Devran Türköz
 *  Software Engineering Student
 *  Nişantaşı University

 * BURDA YAZDIGIM METHODLAR DEGER DONDUREN METHODLAR
 */
public class Method {
    public static double ortalamaBul(int sayi1, int sayi2) { //burda VOID kullanmadım cunku bu method bana deger gerı donurucek
        int toplam = sayi1 + sayi2;
        double ortalama = toplam / 2;
        return ortalama;   //return dişarşya bilgi gonder demek return ortalama ==> ortalamamnın bılgısını gonder
    }
    public static void main(String[] args) {
        ortalamaBul(10, 20);
        System.out.println(ortalamaBul(10, 20));

        /*veya bu sekılde de yazabılırım double sonuc= ortalamaBul(10, 20);
        System.out.println(sonuc); */
    }
}