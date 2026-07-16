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
public  class classes4 {
    public static void main(String[] args) {
      veritabani veritabani = new veritabani();
      veritabani.ekle();
      veritabani.sil();
        veritabani.guncelle();
        System.out.println("-----------------------------------");
        Muhasebe muhasebe = new Muhasebe();
        muhasebe.paraEkle(500);
        muhasebe.paraAl(100);
        muhasebe.toplamParaGoster();
        System.out.println(muhasebe.toplamPara);
    }
}