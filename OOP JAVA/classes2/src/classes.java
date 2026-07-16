
// telefon nesnensını
public class classes {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        telefon.aramaYap( 55555555);
        telefon.aramaKabulEt();
        System.out.println(telefon.marka);
        System.out.println(telefon.model);
        System.out.println(telefon.uretimYili);
        System.out.println(telefon.ekranBoyutu);
    }
}