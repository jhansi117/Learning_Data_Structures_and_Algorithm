public class MaxSubArrSum2 {

    public static int maxSum(int arr[]){
        int max = Integer.MIN_VALUE;

        //1. Construct a prefix array
        int parr[] = new int[arr.length];
        parr[0] = arr[0];
        for(int i=1; i<parr.length; i++){
            parr[i] = parr[i-1] + arr[i];
        }
        //2. Calculate sum of each sub-array using prefix array
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                //formula
                int sum = (start==0)?parr[end]:parr[end] - parr[start-1];
        //3. Find max-sub array sum
                if(sum>max){
                    max = sum;
                }
            }
        }
        

        return max;

    }


    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        int ans = maxSum(arr);
        System.out.println("Max sub-array sum = "+ans);

    }
}
