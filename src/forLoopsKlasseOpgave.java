import java.util.Scanner;


public class forLoopsKlasseOpgave {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int quantity = input.nextInt();

        for(int i =1; i<=quantity; i++){
            System.out.println(("2" + "gange" + i) + "=" + (2*i));

        }

         */
        for (int i = 2; i <= 12; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 4; i <= 79; i += 15) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 30; i >= -20; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -7; i <= 13; i += 4) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 97; i >= 82; i -= 3) {
            System.out.print(i + " ");
        }
    }
}
