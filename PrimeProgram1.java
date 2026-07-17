import java.util.Scanner;

public class PrimeProgram1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fc=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fc++;
            }
        }
        if(fc==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}