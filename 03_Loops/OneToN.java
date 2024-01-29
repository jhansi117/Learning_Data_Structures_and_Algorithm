import java.util.*;

public class OneToN {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
