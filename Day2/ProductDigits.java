import java.util.Scanner;
public class ProductDigits{
        public static void main(String []args){
        int n,r,product=1;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     while(n!=0){
        r=n%10;
        product=product*r;
        n=n/10;
     }
  System.out.println("Product of digits is : "+product);
    }
}
