import java.util.Scanner;

public class PrimeProgram4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of Numbers to check for Prime Numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        int count=0;
        int avg=0;
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                sum+=i;
                count++;
                avg=sum/count;
                System.out.println(i+" is prime");
            }
        }
        System.out.println("The count of prime numbers in the range is: "+count);
        System.out.println("The sum of prime numbers is: "+sum);
        System.out.println("The average of prime numbers is: "+avg);
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
