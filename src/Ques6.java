import java.util.Scanner;
/**

 * @ Author : Sahas Bansal

 */
public class Ques6 {
    public static void main(String[] artgs) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter String Value : ");

        String stringInput = scanner.nextLine();


        stringInput = stringInput.toLowerCase();

        System.out.println("Lowered Case : " + stringInput);
    }
}