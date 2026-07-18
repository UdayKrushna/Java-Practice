import java.util.Scanner;

class PrimeProgram7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=2; ;i++){
            if(isPrime(i)){
                c++;
                if(c==n){
                    System.out.println(i);
                    break;
                }
            }
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