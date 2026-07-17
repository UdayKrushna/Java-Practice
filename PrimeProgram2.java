import java.util.Scanner;

public class PrimeProgram2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        int fc=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fc++;
            }
        }
        if(fc==2){
            return true;
        }
            return false;
    }
}
