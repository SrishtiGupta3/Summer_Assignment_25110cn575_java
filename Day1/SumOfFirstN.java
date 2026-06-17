import java.util.Scanner;
public class SumOfFirstN{
    public static void main(String []args){
        int n,i,sum=0;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(i=1;i<=n;i++){
        sum=sum+i;
     }
  System.out.println("Sum is : "+sum);
    }
}