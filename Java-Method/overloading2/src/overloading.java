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

public class overloading {
    public static void puanYazdir(String kullaniciAdi, int puan){
        System.out.println(kullaniciAdi+" İsimli kullanicinin puani:" +puan);
    }

    public static void puanYazdir(String kullaniciAdi){
        System.out.println(kullaniciAdi+ " isimli kullanicinin puani: 0");
    }

    public static void puanYazdir(int puan){
        System.out.println(" isimsiz kullanicinin puani:" +puan);
    }

    public static void puanYazdir(){
        System.out.println("isimsiz kullanicinin puani: 0");
    }
    public static void main(String[] args) {
        puanYazdir("Devran",100);
        puanYazdir("Demavrin");
        puanYazdir(50);
        puanYazdir();


    }
}