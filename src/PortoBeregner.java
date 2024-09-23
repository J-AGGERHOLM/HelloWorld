import java.util.Scanner;
public class PortoBeregner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double brevVægt = input.nextDouble();
        int pris = 0;
        System.out.println("Du har sagt dit brev vejer " + (double) brevVægt + " gram.");

        if (brevVægt <= 0.0 || brevVægt >= 2000.0) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        } else {

            System.out.println("Prisen for din forsendelse er beregnet til: ");

            if (brevVægt > 0.01 && brevVægt <= 100.0) {
                pris = 25;
                System.out.println(pris+"KR");
            } else {
                if ( brevVægt <= 250.0) {
                    pris = 40;
                    System.out.println(pris+"kr");
                } else {
                    if (brevVægt >= 250.01 && brevVægt <= 500.0) {
                        pris = 50;
                        System.out.println(pris+"KR");
                    } else {
                        if (brevVægt >= 500.01 && brevVægt <= 1000.00) {
                            pris =60;
                            System.out.println(pris + "KR");
                        } else {
                            pris = 70;
                            System.out.println(pris+"KR");
                        }
                    }
                }


            }
        }
    }
}