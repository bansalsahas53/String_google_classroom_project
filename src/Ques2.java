import java.util.Scanner;



public class Ques2 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please Enter any String Value : ");

        String stringInput = scanner.nextLine();

        System.out.printf("Enter the index for substring : ");

        int indexOfSubstring = scanner.nextInt();

        String substring = stringInput.substring(indexOfSubstring);

        System.out.println("subString Value is " + substring);
    }
}