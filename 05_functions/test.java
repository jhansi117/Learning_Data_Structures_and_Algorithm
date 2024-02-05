public class test{
    
    //function-1
    public static void sayHello(){
        System.out.println("Hello World");
        return;
    }

    //function-2
    public static int sum(int a, int b){
        return a+b;
    }

    //function-3
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+"b = "+b);
    }

    public static void main(String args[]){
        swap(4, 5);
        

    }






}