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

public class StringFonksiyonlari {



    public static void main(String[] args) {
        String isim = "Devran Turkoz";
        System.out.println(isim.length()); //bu hazır method yazilan krkt harflerı sayar
       // isim.toUpperCase();   bu method butun harflerı buyuk yazar
        String buyukİsim= isim.toUpperCase();
        System.out.println(buyukİsim);
        String isim2 = isim.toLowerCase();  //bu hazır method kucuk harflerle yazar
        System.out.println(isim2);

        String isim3 = "     Devran Turkoz          "; //bu method metının basından ve sonunda boslukları kaldırır
        System.out.println(isim3.trim());

        String ad= "Devran ";
        String soyad ="Turkoz";
        ad.concat(soyad);  //isim soyisimi birleştiriyor
        String tamİsim = ad.concat(soyad);
        System.out.println(tamİsim);
    }
}