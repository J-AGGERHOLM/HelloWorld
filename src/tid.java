public class tid {
    public static void main(String[] args) {

    int sekund = 10;
    int minut = 56;
    int time = 9;
    double minutPrecise = 56.0;


    int sekunderBrugt =(time*60*60)+(minut*60)+sekund;
    int sekunderTilbage =(24*60*60) - sekunderBrugt;

    int sekundNu = 20;
    int minutNu = 22;
    int timeNu = 10;


    System.out.println("Sekunder:"+sekund);

    System.out.println("Minutter:"+minut);

    System.out.println("timer:"+time);

    System.out.println("Siden midnat er der gået" + " " + sekunderBrugt + " " + "sekunder");

    System.out.println("Der er" + " "+sekunderTilbage+" "+"tilbage af i dag");

        System.out.println("Du har brugt"+" "+((timeNu*60*60+minutNu*60+sekundNu)-sekunderBrugt)+" "+"siden du startede");


        System.out.println("----------------homeWork----------------");


       final int MINUTTER_PER_HOUR = 60;

        System.out.print("Procentdel af timen, der er gået: ");

        System.out.println(minut * 100 / MINUTTER_PER_HOUR);


//ny double variabel lavet til udregningen
        System.out.print("Brøkdel af timen, der er gået: ");

        System.out.println(minutPrecise/ MINUTTER_PER_HOUR);


//typecasting af int variabel inde i udregningen
        System.out.print("Brøkdel af timen, der er gået: ");

        System.out.println((double)minut/MINUTTER_PER_HOUR); //minut er nu double

        // Vi lærte om typeCasting, Konstants og Magic Numbers
        // Vi lærte at man ikke kan beregne doubles med intergers, da der vil være implicit type casting. Nogle programmer kan ikke gøre dette.

    }
}
