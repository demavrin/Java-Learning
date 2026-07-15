import java.util.Scanner;

public class Method {

    public static void ortalamaAl(int sayi1, int sayi2) {  //methodta ıstedıgın kadar sayı kulanabılırsın
        int toplam = sayi1 + sayi2;                 //method oluşturudum daha sonra ortalamaAl methodunu maınde cagrıcam
        double ortalama = toplam / 2;
        System.out.println(ortalama);
    }

    public static void main(String[] args) {    //methodu main içerisinde çaliştiriyorum
       Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyiy giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayiyiy giriniz:");
        int sayi2 = input.nextInt();
        ortalamaAl(sayi1, sayi2);   // kulanıcıdan sayı alalarak method kullanarak ortalama aldım

        ortalamaAl(40, 50);     //buraya kendım belırledıgım sayıların ortalamasını aldım
        ortalamaAl(70, 20);     //buraya kendım belırledıgım sayıların ortalamasını aldım

    }
}