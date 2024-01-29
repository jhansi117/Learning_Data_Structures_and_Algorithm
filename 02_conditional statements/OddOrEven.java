import java.util.*;

public class OddOrEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int n = sc.nextInt();
        //logic
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.err.println("Odd");
        }

    }
}
