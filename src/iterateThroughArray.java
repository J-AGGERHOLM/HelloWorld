import java.util.Arrays;


public class iterateThroughArray {
    public static void main(String[] args) {

        double[] dou = {4.5, 25.3, 12.1, 34.0, 15.5};
        double smallest = dou[0];
        double largest = dou[0];

        for (int i = 0; i < dou.length; i++) {
            System.out.print(Math.pow(dou[i], 2) + ", ");
        }
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            if (dou[i] < smallest){
                smallest = dou[i];
            }
            if (dou[i] > largest){
                largest = dou[i];
            }


        }
        System.out.println("smalles number is " + smallest);
        System.out.println("largest number is " + largest);

    }
}
