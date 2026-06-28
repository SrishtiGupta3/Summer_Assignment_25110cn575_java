package Day4;
import java.util.Scanner;

public class PrintArmstrongNums {
       public static void main(String []args){
        int n,r,n1,n2,n3,i,sum,count;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
      System.out.println("Armstrong Numbers are:");
     for(i=1;i<=n;i++){
        n1=n2=i;
        sum=0;
        count=0;
     while(n1!=0){
    count=count+1;
      n1=n1/10;
     }
     while(n2!=0){
     r=n2%10;
     sum=sum+(int)Math.pow(r,count);
     n2=n2/10;
     }
    if(sum==i){
        System.out.println(sum);
    }
}
       }
}
