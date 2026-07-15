

public class overloading {
    public static void ortalamaYaz(int sayi1, int sayi2){    //bırıncı method
        int toplam = sayi1 + sayi2;
        double ortalama = toplam /2 ;
        System.out.println("ortalama degişkeni:"+ortalama);
    }

    public static void ortalamaYaz2(int sayi1, int sayi2, int sayi3){     //ıkıncı method
        int toplam = sayi1 + sayi2 + sayi3;
        double ortalama = toplam /3 ;
        System.out.println("ortalama degişkeni:"+ortalama);
    }

    public static void main(String[] args) {
        ortalamaYaz(40,60);
        ortalamaYaz2(40,60,100);
    }
}