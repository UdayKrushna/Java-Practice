import java.util.Scanner;

public class PrimeProgram6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
        if(i==n){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

    }
}
