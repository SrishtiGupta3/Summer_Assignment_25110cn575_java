package Day3;

import java.util.Scanner;

public class PrimeNumbersPrint {
    public static void main(String[] args) {

        int num, n, i, j, count = 0;
        System.out.println("Enter Value of number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Prime Number are: ");
        for (i = 1; i <= num; i++) {
            n = i;
            count = 0;
            for (j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
