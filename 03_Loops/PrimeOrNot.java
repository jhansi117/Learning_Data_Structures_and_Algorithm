import java.math.*;
public class PrimeOrNot {
    public static void main(String args[]){
        int num = 45;

        boolean prime = true;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                prime = false;
            }
        }

        String result = (prime==true)?"Prime":"Not Prime";
        System.out.println(result);
    }
}
