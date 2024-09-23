import java.util.Scanner;
public class TommeBeregner {
    public static void main(String[] args) {

        System.out.println("Hej, jeg er en tommeberegner. jeg kan lave tommer om til centimeter. Hvor mange tommer har du målt?");

        Scanner input = new Scanner(System.in);

        double tommerMålt = input.nextDouble();
        final double KONVERSION_NUMMER = 2.54;

        double centimeterMålt = (tommerMålt*KONVERSION_NUMMER);

        System.out.println("Du har målt " + tommerMålt +". "+"Det svarer til " + centimeterMålt +"centimeter.");

    }
}
