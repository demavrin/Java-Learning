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

public class primeNumCheck {
    public static boolean isPrime(int sayi){
    boolean sonuc = true;   //true ıle baslattım cunku ıf bloga gırmezse true olucak ama gırerse false olucak
        for(int i=2; i<sayi; i++){
        if(sayi%i==0){
            sonuc = false;
            break;
        }
    }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kontrol etmek istediginiz sayiyi giriniz:");
        int sayi = input.nextInt();
        boolean sonuc = isPrime(sayi);
        if (sonuc ==true){
           System.out.println("Sayi asaldir");
       }else{
           System.out.println("Sayi asal degildir");
       }




        // System.out.println(isPrime(7));


    }
}