package Day4;
import java.util.Scanner;

public class ArmstrongNum{
   public static void main(String []args){
        int n,r,n1,n2,sum=0,count=0;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     n1=n;
     n2=n;
     while(n!=0){
    count=count+1;
      n=n/10;
     }
     while(n2!=0){
     r=n2%10;
     sum=sum+(int)Math.pow(r,count);
     n2=n2/10;
     }
     if(n1==sum){
         System.out.println("Armstrong Number");
     }
     else{
         System.out.println("Not A Armstrong  Number");
     }
    }
}
