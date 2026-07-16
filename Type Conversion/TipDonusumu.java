/* Devran Turkoz Software engneerıng student */

// Tip donusumlerı string to int etc.
public class TipDonusumu
{
	public static void main(String[] args) {
    String sayi = "45";
     System.out.println(sayi+10);
     
     int tamSayi = Integer.parseInt(sayi); //Stirng olarak sayı ınt olarak verdı
     System.out.println(tamSayi+10); //45 + 10 yaptı 
     
     tamSayi = Integer.valueOf(sayi);
     int toplam = tamSayi + 20;
     System.out.println(toplam);
     
     String sayi1 = "123456789"; //dıyelımkı be bu sayıyı long tıpın donusturmek ıstıyoruö
     long buyukSayi = Long.parseLong(sayi1);
     System.out.println(buyukSayi + 10);
     
     buyukSayi = Long.valueOf(sayi1);
     System.out.println(buyukSayi +10);
     
     String ondallikli = "57.4";
     float fondalik = Float.parseFloat(ondallikli);
     System.out.println(fondalik +10);
     
     double dondalik = Double.valueOf(ondallikli);
     System.out.println(dondalik + 10);
     // ----------------------------------------------- //
     
     //double to ınt 
     
     double ondalik = 27.5788;  //tam sayıya yazdırıyor 
     int tam = (int) ondalik;
     System.out.println(tam);
     
	}
}