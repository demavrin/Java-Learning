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

public class classes3 {
    public static void main(String[] args) {
        Insan Devran = new Insan();
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Boyunuzu giriniz:");
        Devran.boy = input.nextInt();
        System.out.println("Devranin boyu " +Devran.boy);
        System.out.println("Lutfen Kilounuzu giriniz:");
        Devran.kilo = input.nextInt();
        System.out.println("Devranin kilosu:" +Devran.kilo);
        Devran.cinsiyet = "Erkek ";
        System.out.println("cinsiyet " +Devran.cinsiyet);
        Devran.gozRengi = "Kahve ";
        System.out.println("Devranin goz rengi: " +Devran.gozRengi);

        Devran.uyu();
        Devran.kos();
        Devran.yemekYe(" Dolma ");

        Insan Arina = new Insan();
        Arina.boy = 165;
        Arina.kilo = 45;
        Arina.cinsiyet = " KADİN ";
        Arina.gozRengi = " YEŞİL ";
        Arina.sacRengi = " KİZİL";

        Arina.yemekYe(" Dolma ");
        Arina.kos();
        Arina.uyu();
    }
}