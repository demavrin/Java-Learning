package com.mycompany.kapsullemeornek;

import java.util.Scanner;

/**
 *
 * @author demavrın
 */
public class KapsullemeOrnek {

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ogrenci adi:");
        String ad = input.nextLine();
                System.out.print("Ogrenci soyadi:");
                String soyad = input.nextLine();
                System.out.print("Ogrenci numarasi:");
                int okulNo = input.nextInt();
                System.out.print("Ogrencı dogum yili:");
                int dogumYili = input.nextInt();
                
                ogrenci.setAd(ad);  //kulllanıcıdan aldıgım verılerı esıtlıyorum set metodlara.
                ogrenci.setSoyad(soyad);
                ogrenci.setOkulNo(okulNo);
                ogrenci.setDogumYili(dogumYili);
    }
}
