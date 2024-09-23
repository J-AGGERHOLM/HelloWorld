import java.util.Random;
import java.util.Scanner;

public class GætEtTalLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1, 11);
        int userGuess = -1;
        int antalGæt = 1;


        while (numberToGuess != userGuess) {

            System.out.println("Hej, vælg et tal mellem 1 og 10");
            userGuess = input.nextInt();
            if (numberToGuess == userGuess) {
                System.out.println("Du har gættet rigtigt");
            }

            if (numberToGuess < userGuess) {
                antalGæt = (antalGæt+1);
                System.out.println("tallet er lavere en du har gættet");
            }
            if (numberToGuess > userGuess) {
                antalGæt++ ; //++ is a different way to count
                System.out.println("Tallet er højere end du har gættet");

            }
            }
        System.out.println("Du har gættet " + antalGæt + " gange");
        }

    }





