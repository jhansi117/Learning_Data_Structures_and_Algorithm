public class Calculator {
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        char ch = '/';

        //logic
        switch(ch){
            case '+':
                System.out.println("A+B = "+(A+B));
                break;
            case '-':
                System.out.println("A-B = "+(A-B));
                break;
            case '*':
                System.out.println("A*B = "+(A*B));
                break;
            case '/':
                System.out.println("A/B = "+(A/B));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
