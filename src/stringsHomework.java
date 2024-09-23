import java.util.Scanner;
public class stringsHomework {

    public static void main(String[] args) {

        String studentFirstName = "Kayla";
        String studentLastName = "Lang";
        String studentFullName = studentFirstName + " " + studentLastName;
        double GPA = 3.45;

        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentFullName);

        System.out.print(studentFullName + " "+"has a GPA of"+" ");
            System.out.println(GPA);
        System.out.println("What would you like to update it to?");

        //scanner=Datatype, input is variable,
        Scanner input = new Scanner(System.in);

        //input is variable
        //writing variable.function is called "calling a function to that variable".
        GPA = input.nextDouble();
        // Declaring this variable to be this input now. It was already defines with the double '
        // data type before, so it'll remember that and only store doubles.

        System.out.print(studentFullName + " "+"now has a GPA of"+" ");
        System.out.println(GPA);

        //we learned how to import
        //we learned about a new reference type 'Scanner'
        // Jeg opdagede en input mismatch error, som man får når man inputter en datatype som scanneren ikke forventer.
        // i dette tilfælde var det fordi jeg skrev 4.2 istedet for 4,2.
    }
}
