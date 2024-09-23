import java.util.Scanner;

public class TidsBeregner {

    public static void main(String[] args) {

        System.out.println("Hvor mange timer er der gået?");

        Scanner input = new Scanner(System.in);

        int timer = input.nextInt();

        System.out.println("Der er gået " + timer + " Timer.");

        ///////////////////////////

        System.out.println("Hvor mange minutter er der gået?");

        Scanner input2 = new Scanner(System.in);

        int minutter = input2.nextInt();

        System.out.println("Der er gået " + minutter + " minutter.");
        ////////////////////////////

        System.out.println("Hvor mange sekunder er der gået?");

        Scanner input3 = new Scanner(System.in);

        int sekunder = input3.nextInt();

        System.out.println("Der er gået " + sekunder + " sekunder.");

        int sekunderBrugt =(timer*60*60)+(minutter*60)+sekunder;
        int sekunderTilbage =(24*60*60) - sekunderBrugt;

        System.out.println("Der er gået " + sekunderBrugt + "sekunder siden midnat idag");

        //vi brugte scanner til at spørge om tid, og bagefter bruge inputtet til at lave en beregning.
        //Scanner input = new Scanner(System.in); er hvor man instanciater scanneren. Altså man får den ind i scriptet til at den kan calles, som et variable.
    }
}
