public class OddEvenSum {
    public static void main(String[] args) {
        int num = 12345;
        int OddSum = 0;
        int EvenSum = 0;
        while(num > 0){
            int last = num%10;
            if(last%2==0){
                EvenSum += last;
            }else{
                OddSum += last;
            }
            num = num/10;
        }

        System.out.println("Sum of odd integers = "+OddSum);
        System.out.println("Sum of even integers = "+EvenSum);
    }
}
