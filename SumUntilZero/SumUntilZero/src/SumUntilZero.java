/*
 Devran Turkoz
 Nisantasi University (Software Engineering Student)
*/

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int number;

        while (true) {

            System.out.print("Please enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            total += number;
        }

        System.out.println("----------------------------");
        System.out.println("The sum is: " + total);

        scanner.close();
    }
}