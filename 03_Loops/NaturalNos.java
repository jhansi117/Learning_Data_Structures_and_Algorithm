import java.util.*;
public class NaturalNos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println("Sum = "+sum);
        System.out.println("Sum = "+ (n*(n+1)/2));

    }
    
}
