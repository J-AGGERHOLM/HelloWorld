import java.util.Scanner;

public class BmiBeregner {
    public static void main(String[] args) {

        System.out.println("Vi skal beregner din BMI!");
        System.out.println("Indtast din vægt i kilogram:");
        Scanner input = new Scanner(System.in);
        double vægt = input.nextDouble();

        System.out.println("Din højde i meter:");
        Scanner input2 = new Scanner(System.in);
        double højde = input2.nextDouble();

        System.out.println("Du sagde din højde er " + højde + " meter.");

        double BMI = vægt / (Math.pow(højde, 2));
        //Math.pow(variable,2) sætter variablen^2

        /*
        //Chaining Version:

        System.out.println("Din BMI er beregner til " + BMI);

        if (BMI >= 25.1 && BMI <= 30.0) {
            System.out.println("Du er overvægtig.");}
        else if (BMI >= 30.0) {
            System.out.println("Du er svært overvægtig.");}
        else if (BMI >= 18.6 && BMI <= 25.0) {
            System.out.println("Du har normal vægt.");}
        else if (BMI <= 18.5) {
            System.out.println("Du er undervægtig.");}

        }
         */

        //Nesting version:
        System.out.println("Din BMI er beregner til " + BMI);

        if (BMI >= 25.0 && BMI <= 30.0) {
            System.out.println("Du er overvægtig.");
        } else {
            if (BMI >= 30.0) {
                System.out.println("Du er svært overvægtig.");
            } else {
                if (BMI >= 18.5 && BMI <= 25.5) {
                    System.out.println("Du har normal vægt.");
                } else {
                    System.out.println("Du er undervægtig.");
                }
            }


        }

        //Relational operaters, Boolean Operaters, Control flow, chaining og nesting, Scope, Blocks


    }
}