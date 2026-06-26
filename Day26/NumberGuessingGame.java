import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int x = 25;
        int y;
        int i;
        System.out.println(
                "WELCOME!\nThis is a Guessing Game.\nYou will have 5 chances only to identify the number choosen by Computer (Number is btw 1 to 100).\nSo Let's Begin!");
        System.out.println("Now Guess The Number:");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        for (i = 1; i <= 4; i++) {
            if ((y > x) && (y > 75) && (y <= 100)) {
                System.out.println("Too High");
                System.out.println("Guess Again.");
                y = sc.nextInt();
            } else if ((y < x) && (y < 5) && (y >= 1)) {
                System.out.println("Too Low");
                System.out.println("Guess Again.");
                y = sc.nextInt();

            } else if ((y >= 20) && (y <= 30) && (y != 25)) {
                System.out.println("Not Correct Guess.But You are close.");
                System.out.println("Guess Again.");
                y = sc.nextInt();
            } else if (y == 25) {
                System.out.println("Congrats!You Have Guess Correct.");
                break;
            } else {
                System.out.println("Invalid Number.");
                System.out.println("Guess Again.");
                y = sc.nextInt();
            }
        }
        if (i >= 5) {
            System.out.println("Chances Over!");
        }
    }
}
