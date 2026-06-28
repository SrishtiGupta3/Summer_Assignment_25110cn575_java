package Day3;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String []args){
    int num,i,count=0;
    System.out.println("Enter Value of number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    for(i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
if(count==2){
    System.out.println("Prime number");
}
else{
    System.out.println("Not a prime number");
}
}
}