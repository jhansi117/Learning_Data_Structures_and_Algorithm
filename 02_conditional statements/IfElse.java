import java.util.*;

public class IfElse{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }

        if(age>=13 && age<18){
            System.out.println("Teenager");
        }
        
        else{
            System.out.println("Not Adult");
        }
    }
}