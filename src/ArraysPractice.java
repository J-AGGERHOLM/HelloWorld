import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0};

        nums[0] = 34;
        nums[7] = 117;


        for (int i =0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        String[] words = {"hej", "med", "dig"};
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]+ " ");
        }
        System.out.println();

        double[] dous = {3.4, 2.5, 1.2, 6.7};

        System.out.println(dous[2]+" " +" "+ dous.length);

    }
}
