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

public class IdentityChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kimlik No: ");
        String kimlikNo = input.next();

        if (kimlikNo.length() != 11) {
            System.out.println("TC Kimlik No 11 haneli olmalıdır.");
            return;
        }

        char sonRakam = kimlikNo.charAt(10);

        switch (sonRakam) {

            case '0':
                System.out.println("burs basvurusu bu tarihte : 01.01.2020");
                break;

            case '2':
                System.out.println("burs basvurusu bu tarihte : 02.01.2020");
                break;

            case '4':
                System.out.println("burs basvurusu bu tarihte : 03.01.2020");
                break;

            case '6':
                System.out.println("burs basvurusu bu tarihte : 04.01.2020");
                break;

            case '8':
                System.out.println("burs basvurusu bu tarihte :05.01.2020");
                break;

            default:
                System.out.println("Bir hata oluştu!");
        }
    }
}