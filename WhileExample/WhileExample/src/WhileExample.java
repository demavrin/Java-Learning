import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("2.Enter a number: ");
        int num2 = input.nextInt();

        int i = num1;
        while (i <= num2) {
            if (i % 2== 0) {
                System.out.println(i);
            }
       i++;
        }
    }
}