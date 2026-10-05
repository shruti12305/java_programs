import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine().toLowerCase();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine().toLowerCase();

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        String sortedWord1 = new String(first);
        String sortedWord2 = new String(second);

        if (sortedWord1.equals(sortedWord2)) {
            System.out.println("Words are Anagrams");
        } else {
            System.out.println("Words are Not Anagrams");
        }

        sc.close();
    }
}