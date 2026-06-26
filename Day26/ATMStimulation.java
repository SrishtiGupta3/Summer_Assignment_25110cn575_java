import java.util.Scanner;

public class ATMStimulation {
    public static void main(String[] args) {
        int y;
        long z, w;
        long x = 2000000;
        System.out.println("ATM.\nOptions are:\n1)Check balance\n2)Deposit Money\n3)Withdraw Money\n4)Exit");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        if (y == 1) {
            System.out.println("Current Balance is: " + x);
        } else if (y == 2) {
            System.out.println("Enter Money Amount to be deposited:");
            z = sc.nextLong();
            x = x + z;
        } else if (y == 3) {
            System.out.println("Enter Amount to be Withdraw:");
            w = sc.nextLong();
            if ((x - w) >= 10000) {
                x = x - w;
            } else {
                System.out.println("Amount is Large.Not Enough Balance.\nCannot Withdraw.");
            }
        } else if (y == 4) {
            System.out.println("Exit");
        } else {
            System.out.println("Invalid Choice");
        }
        if (x >= 0) {
            System.out.println("Total Balance: " + x);
        }
    }
}
