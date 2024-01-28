import java.util.*;
public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The product of "+a+" and "+b+" is "+(a*b));
    }
}
