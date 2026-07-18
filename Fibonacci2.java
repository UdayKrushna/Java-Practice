import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting value");
        int n=sc.nextInt();
        System.out.println("Enter the ending value");
        int m=sc.nextInt();
        int a=0;
        int b=1;
        while(a<=m){
            if(a>=n){
                System.out.println(a+" ");
            }
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
