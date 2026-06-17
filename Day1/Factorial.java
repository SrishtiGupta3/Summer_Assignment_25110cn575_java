import java.util.Scanner;
public class Factorial{
    public static void main(String []args){
        int n,i,fact=1;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(i=1;i<=n;i++){
        fact=fact*i;
     }
  System.out.println("Factorial is : "+fact);
    }
}