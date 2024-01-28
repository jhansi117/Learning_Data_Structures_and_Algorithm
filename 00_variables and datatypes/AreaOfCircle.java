import java.util.*;

public class AreaOfCircle {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("radius = ");
        float rad = sc.nextFloat();
        // double area = 3.14*rad*rad;
        float area = 3.14f*rad*rad;
        System.out.println("The area of circle with radius "+rad+" is "+area);
    }
}
