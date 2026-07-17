import java.util.Scanner;
class PrimeProgram3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers to check for prime numbers (two integers):");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
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