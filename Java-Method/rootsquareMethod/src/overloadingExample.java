public class overloadingExample {

    public static void karesiniAl(int sayi){     //burda overloadıng kullandım cunku kullanıcı
        int sonuc = sayi * sayi;                 //tam sayi girerse bu method calısır
        System.out.println("sonuc:" +sonuc);
    }

    public static void karesiniAl(double sayi){       //kullanıcı vürgüllü sayi girerse bu method calısır
        double sonuc = sayi * sayi;
        System.out.println("sonuc:" +sonuc);
    }

    public static void main(String[] args) {
        karesiniAl(42.5);
        karesiniAl(12.5);
        karesiniAl(120);
    }
}