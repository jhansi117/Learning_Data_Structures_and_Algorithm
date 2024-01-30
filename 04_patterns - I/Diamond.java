public class Diamond {
    public static void main(String[] args) {
        int n = 4;
        //straight
        for(int i=0; i<n; i++){
            //spaces
            for(int j=1; j<n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=(2*i)+ 1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //inverted
        for(int i=n-1; i>=0; i--){
            //spaces
            for(int j=1; j<n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=(2*i)+ 1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
