import java.util.Scanner;

public class VotingEligibilitySystem {
    public static void main(String[] args) {
        int y;
        int i;
        System.out.println("WELCOME!.\nTo Check Your Eligibility for Voting.\nEnter Your Age.");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        if ((y < 18) && (y >= 0)) {
            System.out.println("Not Eligible for Voting.");
        } else if (y == 18) {
            System.out.println("Congrats!\nYou are 18 now.\nEligible for Voting.");

        } else {
            System.out.println("Eligible for Voting.");
        }
    }
}
