public class PrintReverse {
    public static void main(String args[]){
        int num = 543;
        while(num!=0){
            int lastDigit = num%10;
            System.out.print(lastDigit);
            num = num/10;
        }
    }
}
