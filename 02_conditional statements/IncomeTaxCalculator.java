import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Salary = ");
        float income = sc.nextInt();
        double tax = 0;

        //logic
        if(income<5_00_000){
            tax = 0;
        }
        else if(income>=5_00_000 && income<=10_00_000){
            tax = income * 0.2;
        }
        else{
            tax = income * 0.3;
        }

        //output
        System.out.println(tax);

        

    }
}
