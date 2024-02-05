public class Prime {

    public static boolean PrimeOrNot(int n){
        boolean isPrime = true;
        if(n==1){
            System.out.println("Neither prime nor composite");
        }
        if(n==0){
            return isPrime;
        }else{
            for(int i=2; i<n-1; i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }

    public static void PrimesInRange(int n){
        for(int i=2; i<n; i++){
            if(PrimeOrNot(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        // boolean ans = PrimeOrNot(10);
        // if(ans){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("Not Prime");
        // }

        PrimesInRange(50);

    }
}
