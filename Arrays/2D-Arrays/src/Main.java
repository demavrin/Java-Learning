/* DEVRAN TURKOZ
NİŞANTAŞİ UNİVERSİTY => SOFTWARE ENGİNEERİNG STUDENT
 */

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        /*  int[] array = new int[10];  ====> ARRAY WITH LENGHT 10
        int[][] array = new int[][];    2d array
        int[][] array = new int[satir][sütün] */

        int[][] array = new int[3][3];
        array[0][0] =5;
        array[0][1] =10;
        array[0][2] =15;
        array[1][0] =20;
        array[1][1] =25;
        array[1][2] =30;
        array[2][0] =35;
        array[2][1] =40;
        array[2][2] =45;

        System.out.println(array[0][1]);

    }
}