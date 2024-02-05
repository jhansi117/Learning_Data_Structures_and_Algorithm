public class MaxSubArrSum1 {

    public static void maxsum(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.print(" = "+sum);
                System.out.println();
                if(sum>max){
                    max = sum;
                }
                if(sum<min){
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sub-array sum = "+max);
        System.out.println("Minimum sub-array sum = "+min);
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        maxsum(arr);
        int tot = (arr.length*(arr.length+1))/2;
        System.out.println("Total no.of subarrays = "+tot);
    }
}
