 import java.util.Scanner;
public class Palindrome {
   public static void main(String []args){
        int n,r,reverse=0,n1;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     n1=n;
     while(n!=0){
      r=n%10;
      reverse=reverse*10+r;
      n=n/10;
     }
     if(reverse==n1){
         System.out.println("Palindrome Number");
     }
     else{
         System.out.println("Not A Palindrome Number");
     }
    }
}

