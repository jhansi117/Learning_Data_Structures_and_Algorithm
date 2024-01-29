import java.util.*;

public class LargestOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();

        if(A>B){
            System.out.println(A+" is greater than "+B);
        }else{
            System.out.println(B+" is greater then "+A);
        }

    }
}
