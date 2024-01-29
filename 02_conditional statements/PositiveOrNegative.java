import java.util.*;

public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int num = sc.nextInt();

        //logic

        String result = num>=0? "Positive": "Negative";
        System.out.println(result);

    }
}
