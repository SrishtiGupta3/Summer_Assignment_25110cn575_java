package Day4;
import java.util.Scanner;

public class FibonacciSeries{
   public static void main(String []args){
        int n,a,b,c,i;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     a=0;
     b=1;
      System.out.print("Fibonacci Series is:\n");
      System.out.print(a+"\t");
       System.out.print(b+"\t");
    for(i=1;i<=n-2;i++){
        c=a+b;
           System.out.print(c+"\t");
           a=b;
           b=c;
    }
    }
}

