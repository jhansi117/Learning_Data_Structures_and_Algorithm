public class Binomial {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int Bino(int n, int r){
        int ans = (int) (factorial(n))/(factorial(r)*factorial(n-r));
        return ans;

    }
    public static void main(String args[]){

        System.out.println(Bino(5, 2));

    }
    
}
