public class OverloadDatatype {

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(float a , float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(2.0f, 2.0f));
        System.out.println(add(5,6));
    }
}
