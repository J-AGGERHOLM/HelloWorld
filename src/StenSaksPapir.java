import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();




        String pcInput = "String";
        int SENTINEL = 3;
        int userPoint = 0;
        int pcPoint = 0;
        String roundResult ="";

        while((userPoint != SENTINEL) && (pcPoint != SENTINEL)){

            System.out.println("Sten, Saks eller papir?");
            int pcRandomNumber = rand.nextInt(3)+1;

            if (pcRandomNumber == 1) {
                pcInput = "Saks";
            }
            if (pcRandomNumber == 2) {
                pcInput = "Sten";
            }
            if (pcRandomNumber == 3) {
                pcInput = "Papir";
            }

            String userInput = input.next();
            System.out.println("you picked " + userInput + " the pc chose " + pcInput);
            if (userInput.equalsIgnoreCase(pcInput)) {
                System.out.println("It's a draw!");
            } else {
                if (userInput.equalsIgnoreCase("Saks") && pcInput.equalsIgnoreCase("sten")) {
                    roundResult = "loser";
                    System.out.println("loser");
                }
                else if (userInput.equalsIgnoreCase("Saks") && pcInput.equalsIgnoreCase("papir")) {
                    roundResult = "winner";
                    System.out.println("winner");
                }
                else if (userInput.equalsIgnoreCase("Sten") && pcInput.equalsIgnoreCase("Saks")) {
                    roundResult = "winner";
                    System.out.println("winner");
                }
                else if (userInput.equalsIgnoreCase("Sten") && pcInput.equalsIgnoreCase("Papir")) {
                    roundResult = "loser";
                    System.out.println("loser");
                }
                else if (userInput.equalsIgnoreCase("Papir") && pcInput.equalsIgnoreCase("sten")) {
                    roundResult = "winner";
                    System.out.println("winner");
                }
                 else if (userInput.equalsIgnoreCase("Papir") && pcInput.equalsIgnoreCase("Saks")) {
                    roundResult = "loser";
                    System.out.println("loser");
                }
                 if (roundResult.equalsIgnoreCase("winner")){
                    userPoint++;
                }
                if (roundResult.equalsIgnoreCase("loser")){
                    pcPoint++;
                }
            }
        }
        if(userPoint>pcPoint) {
            System.out.println("congrats! you won " + userPoint + "/" + pcPoint);
        }
        if(userPoint<pcPoint) {
            System.out.println("pc won " + pcPoint + "/" + userPoint);
        }
/*
        if (userInput.equalsIgnoreCase(pcInput)) {
            System.out.println("It's a draw!");
        } else {
            if (userInput.equalsIgnoreCase("Saks") && pcInput.equalsIgnoreCase("sten")) {
                System.out.println("loser");
            }
            if (userInput.equalsIgnoreCase("Saks") && pcInput.equalsIgnoreCase("papir")) {
                System.out.println("winner");
            }
            if (userInput.equalsIgnoreCase("Sten") && pcInput.equalsIgnoreCase("Saks")) {
                System.out.println("winner");
            }
            if (userInput.equalsIgnoreCase("Sten") && pcInput.equalsIgnoreCase("Papir")) {
                System.out.println("loser");
            }
            if (userInput.equalsIgnoreCase("Papir") && pcInput.equalsIgnoreCase("sten")) {
                System.out.println("winner");
            }
            if (userInput.equalsIgnoreCase("Papir") && pcInput.equalsIgnoreCase("Saks")) {
                System.out.println("loser");
            }
        }

 */


    }
}
