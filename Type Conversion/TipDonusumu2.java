/* Devran Turkoz Software engneerıng student */

// 
public class TipDonusumu2
{
	public static void main(String[] args) {
   int sayi = 11; // bunu strıng yapmak ıstersek
   String karakterSayi = String.valueOf(sayi);
   System.out.println(karakterSayi +10);
   
   double pi = 3.14; // double --> stringe donusuturcem
   System.out.println(String.valueOf(pi +10));
   
   char[] karakterler = {'a', 'b', 'c'}; //char ==> String
   String charDizisi = String.valueOf(karakterler);
   System.out.println(karakterler);
   
	}
}