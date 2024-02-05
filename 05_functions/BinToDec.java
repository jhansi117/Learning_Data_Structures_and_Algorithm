import java.math.*;

public class BinToDec {
    //function to count no.of digits
    public static int count(int n){
        int count = 0;
        while(n>0){
            count = count+1;
            n = n/10;
        }

        return count;
    }

    //Binary to decimal
    public static int BinaryToDecimal(int n){
        int dec = 0;
        int i = 0;
        while(n>0){
            int last = n%10;
            dec = dec + last * (int)(Math.pow(2,i));
            i++;
            n = n/10;
        }
        return dec;
    }

    //reverse a number
    public static int reverse(int n){
        int rev = 0;

        while(n>0){
            int last = n%10;
            rev = (rev*10) + last;
            n = n/10;
        }

        return rev;
    }

    //Decimal to Binary
    public static int DecToBin(int n){
        int bin = 0;
        while(n > 0){
            int rem = n%2;
            bin = (bin * 10)+rem;
            n = n/2;
        }
        return reverse(bin);
    }

    //main function
    public static void main(String[] args) {
        System.out.println(DecToBin(6));
    }
}
