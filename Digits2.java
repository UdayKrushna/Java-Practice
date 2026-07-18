import java.util.Scanner;

public class Digits2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int r=n%10;
            if(r%2==0){
                System.out.println("Even digit: "+r);
            }
            else{
                System.out.println("Odd digit: "+r);
            }
            n=n/10;
            count++;
        }
        System.out.println("Number of digits: "+count);
    }
}
