/* DEVRAN TURKOZ
NİŞANTAŞİ UNİVERSİTY => SOFTWARE ENGİNEERİNG STUDENT
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int sayilar[] = new int[10];
        int tumToplam = 0;
        int İlkSonToplam = 0;

        for(int i=0; i<10; i++){
            System.out.println("Sayi giriniz:");
            sayilar[i] =input.nextInt();
            tumToplam += sayilar[i];
        }
        İlkSonToplam = sayilar[0] + sayilar[9];
        double oran = İlkSonToplam / tumToplam;

        System.out.println("--------------------------------------");
        System.out.println("Dizinin toplami:" +tumToplam);
        System.out.println("--------------------------------------");
        System.out.println("İlk ve Son degerlerin toplami:" +İlkSonToplam);
        System.out.println("--------------------------------------");
        System.out.println("ilk ve son sayilarin tum toplamina orani:"+oran);
    }
}