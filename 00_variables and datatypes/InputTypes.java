import java.util.*;

class InputTypes {
    public static void main(String args[]){
        // System.out.println("Enter anything: ");
        Scanner sc = new Scanner(System.in);
        // String anything = sc.next();
        // String anything = sc.nextLine();
        // System.out.println(anything);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));

    }
}
