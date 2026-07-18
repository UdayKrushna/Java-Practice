import java.util.Scanner;

public class Digits1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        while(n>0){
            int r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
}
