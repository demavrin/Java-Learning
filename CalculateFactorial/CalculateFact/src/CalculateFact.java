import  java.util.Scanner;
public class CalculateFact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of facts: ");
        int number = input.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= number; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(number + "faktoryel esittir:" + faktoriyel);
    }
}