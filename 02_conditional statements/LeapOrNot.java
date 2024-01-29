import java.util.*;
public class LeapOrNot {
    public static void main(String args[]){
        //input
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //logic
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                }else{
                    System.out.println("Not Leap");
                }
            }else{
                System.out.println("Leap");
            }
        }else{
            System.out.println("Not Leap");
        }
    }
}
