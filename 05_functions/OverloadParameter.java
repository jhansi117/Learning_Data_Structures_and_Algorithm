public class OverloadParameter {

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        int two = multiply(3, 4);
        int three = multiply(3, 2, 4);
        System.out.println(two);
        System.out.println(three);
    }
}
