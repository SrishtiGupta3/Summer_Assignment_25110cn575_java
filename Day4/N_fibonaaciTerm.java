package Day4;
import java.util.Scanner;
public class N_fibonaaciTerm {
       public static void main(String []args){
        int n,a,b,c=0,i;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     a=0;
     b=1;  
    for(i=1;i<=n-2;i++){
           c=a+b;
           a=b;
           b=c;
    }
     System.out.println("Nth Term is: "+c);
    }
}
