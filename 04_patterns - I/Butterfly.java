public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        //straight
        for(int i=0; i<n; i++){
            //star
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            //space
            for(int j=i+2; j<(2*n-i); j++){
                System.out.print("  ");
            }

            //star
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //inverted
        for(int i=n-1; i>=0; i--){
            //star
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            //space
            for(int j=i+2; j<(2*n-i); j++){
                System.out.print("  ");
            }

            //star
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
