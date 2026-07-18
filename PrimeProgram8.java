import java.util.Scanner;

public class PrimeProgram8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int bf=0;
        int af=0;
        for(int i=n-1;i>=1;i++){
            if(isPrime(i)){
                bf=i;
                break;
            }
        }
        for(int i=n+1;;i++){
            if(isPrime(i)){
                af=i;
                break;
            }
        }
        if(n-bf<af-n){
            System.out.println(bf);
        }
        else if(n-bf>af-n){
            System.out.println(af);
        }
        else{
            System.out.println(bf+" "+af);
        }
    }
    static boolean isPrime(int n){
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
