public class Unary {
    public static void main(String args[]){
        int a = 10;
        int b = ++a; //change and then will be used.
        System.out.println(a);
        System.out.println(b);

        int c = 5;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
    }
}
