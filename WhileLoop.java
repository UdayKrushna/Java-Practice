import java.util.*;
public class WhileLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Enter the number of times you want");
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
