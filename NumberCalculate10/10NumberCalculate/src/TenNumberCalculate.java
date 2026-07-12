// Devran Turkoz
import java.util.Scanner;

public class TenNumberCalculate {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int total = 0;
       for (int i = 0 ; i<10; i++){
           System.out.println("sayi giriniz (enter number):");
           int number = input.nextInt();
           total += number;

       }
        System.out.println("total is :" + total);
    }

}