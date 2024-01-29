import java.util.*;
public class LargestOfThree {
    public static void main(String args[]){
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();

        //logic
        if(A>B){
            if(A>C){
                System.out.println(A+" is the greatest.");
            }else{
                System.out.println(C+" is the greatest.");
            }
        }else if(B>C){
            System.out.println(B+" is the greatest.");
        }else{
            System.out.println(C+" is the greatest.");
        }

    }
}
