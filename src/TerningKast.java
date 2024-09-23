import java.util.Random;

public class TerningKast {
    public static void main(String[] args) {
        Random rand = new Random();

        int sum = 0;

        while (sum != 7) {
            int terning1 = rand.nextInt(1, 7);
            int terning2 = rand.nextInt(1, 7);
            sum = terning1 + terning2;

            //System.out.println(terning1+" + "+terning2+" = "+sum);

            if (sum != 7) {

                System.out.println("summen af terningerne blev !" + sum + " lad os prøve igen");

            } else {
                System.out.println("summen af terningerne blev 7!");
            }


        }
    }
}
