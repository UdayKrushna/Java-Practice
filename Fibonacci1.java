import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        while(a<=n){
            System.out.println(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
