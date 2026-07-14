/* Devran Turkoz
=========Nısantası unıversıty Software engıneerıng student========
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 6, 4, 26, 128, 540};
        String[] isimler = {"Devran", "Aleksandr", "Marvel", "Belgrad", "Martin"};
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("============================");
        for(int j=0; j<isimler.length; j++){
            System.out.println(isimler[j]);
            for(int number: numbers){
                System.out.println(number);
            }
        }
    }
}