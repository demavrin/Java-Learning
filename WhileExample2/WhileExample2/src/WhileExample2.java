/* Devran Turkoz
Nısantası Unıversıty (Software Engıneerıng Student)
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TotalEven = 0;
        int TotalOdd = 0;

        int i=0;
        int number;
        while(i<10){
            System.out.print(i+"Enter a number:");
            number = input.nextInt();
            if (number%2==0){
                TotalEven+=number;
            }else{
                TotalOdd+=number;
            }
            i++;
        }

        System.out.println("--------------------------------");
        System.out.println("Sum of Even numbers: "+TotalEven);
        System.out.println("Sum of Odd numbers: "+TotalOdd);
    }
}