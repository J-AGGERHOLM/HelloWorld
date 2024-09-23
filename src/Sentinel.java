import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int SENTINEL = -1;
        int sum = 0;
        int tal = 0;

        while(tal != SENTINEL){
            sum += tal;
            System.out.println("Indtast et tal");
            tal = input.nextInt();


        }
        System.out.println("Summen er " + sum);
    }
}
