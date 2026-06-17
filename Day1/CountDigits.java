import java.util.Scanner;
public class CountDigits{
        public static void main(String []args){
        int n,count=0;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     while(n!=0){
        n=n/10;
        count=count+1;
     }
  System.out.println("Digita Count is : "+count);
    }
}

