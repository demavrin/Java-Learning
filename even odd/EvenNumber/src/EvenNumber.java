/*
DEVRAN TURKOZ2.
NISANTASI UNIVERSITY (software engıneerıng student)
*/
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();
        for(int i=num1; i<=num2; i++){
           if(i%2==0){
               System.out.println(i);
           }
        }
    }
}