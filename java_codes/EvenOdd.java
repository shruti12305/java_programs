import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = (number % 2 == 0) ? "Number is Even" : "Number is Odd";

        System.out.println(result);

        input.close();
    }
}