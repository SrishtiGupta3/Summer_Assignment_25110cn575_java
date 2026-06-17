   import java.util.Scanner;
   public class ReverseNum{
   public static void main(String []args){
        int n,r,reverse=0;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     while(n!=0){
      r=n%10;
      reverse=reverse*10+r;
      n=n/10;
     }
  System.out.println("Reverse Number is : "+reverse);
    }
}
