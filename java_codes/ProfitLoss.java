public class ProfitLoss {
    public static void main(String[] args) {

        int cp = 500;
        int sp = 650;

        int difference = sp - cp;

        if (difference > 0) {
            System.out.println("Profit = " + difference);
        } else if (difference < 0) {
            System.out.println("Loss = " + (-difference));
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}