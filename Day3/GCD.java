package Day3;
import java.util.Scanner;
public class GCD {
    public static void main(String []args){
    int num2,num1,i,y=1,gcd;
    System.out.println("Enter Value of numbers:");
  Scanner sc=new Scanner(System.in);
  num1=sc.nextInt();
  num2=sc.nextInt();
  for(i=1;i<=num1&&i<=num2;i++){
        if((num1%i==0)&&(num2%i==0)){
           y=i*y;
        }
        }
           gcd=y;
         System.out.println("GCD is: "+gcd);
    }
}
