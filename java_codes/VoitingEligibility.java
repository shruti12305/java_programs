import java.util.Scanner;

public class VoitingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Age is valid and eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }
}