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

public class Multidimensional {
  public static void main(String[] args) {
    int[][] array = {{5, 10, 15}, {20, 25, 30}, {35, 40, 45}}; // new int [3][3]
    int total =0;
   /* System.out.println(array[0][0]);
    System.out.println(array[0][1]);
    System.out.println(array[0][2]);
    System.out.println(array[1][0]);   ======> bunun yerıne iç içe döngü kullanabılırz
    System.out.println(array[1][1]);   ======> tek tek boyle yazmamak için
    System.out.println(array[1][2]);
    */
    for(int i=0; i<array.length; i++){
      total= 0;
      for(int j=0; j<array[i].length; j++){
        System.out.print(array[i][j]+" ");
        total = total + array[i][j];
      }
      System.out.println();
      System.out.println(total);
    }
    System.out.println("loop finished");
  }
}