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
 */


import java.util.Scanner;

public class  MethodExample {
    public static void buyukBul(int sayi1, int sayi2){
        if (sayi1>sayi2){
            System.out.println(sayi1+  "Buyuktur");
        }else if (sayi2>sayi1){
            System.out.println(sayi2+  "Buyuktur");
        }else{
            System.out.println("her iki sayi eşittir");
        }
    }
    public static void main(String[] args) {  //buyuk sayıyı bul method yazdım burada kullanıcam
       Scanner input = new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        int sayi2 = input.nextInt();
        buyukBul(sayi1,sayi2);  //burada kullanıcıdan sayıyı alıp hangısı buyuktur gosterıyor
        buyukBul(40,90);  //burda kendım belırledıgım sayıyı buyuk mu buluyor

    }
}