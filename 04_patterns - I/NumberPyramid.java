public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i=0; i<5; i++){
            //spaces
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
    }
}
