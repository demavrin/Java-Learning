public class Muhasebe {
    public int toplamPara = 0;         //class ozellıkler
    public String ilgiliSorumlu = "Devran";

    public void paraEkle(int para){
        toplamPara+=para;
        System.out.println(" Para Eklendi. Toplam para: "+toplamPara);
    }
    public void paraAl(int para){
        toplamPara-=para;
        System.out.println("Para cekıldı. Toplam para: "+toplamPara);
    }
    public void toplamParaGoster (){
        System.out.println(toplamPara);
    }
}
