import java.util.*;
public class DoWhileLoop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Enter the number of times you want");
        int n=sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        sc.close();
    }
}
