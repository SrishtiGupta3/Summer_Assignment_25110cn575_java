import java.util.Scanner;
public class Mutltiplication{
    public static void main(String []args){
        int n,i;
        System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println("Multiplication Table is:");
     for(i=1;i<=10;i++){
        System.out.println(n+"*"+i+"= "+(n*i));
     }
    }
}