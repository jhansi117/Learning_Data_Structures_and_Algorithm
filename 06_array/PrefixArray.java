public class PrefixArray {

    public static void prefixArr(int arr[]){
        int max = Integer.MIN_VALUE;
        int parr[] = new int[arr.length];
        //construct prefix array
        parr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            parr[i] = parr[i-1] + arr[i];
        }
        //print sub-array and sub-array sum using prefix array
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int sum = 0; //each sub-array starts here
                // for(int k=i; k<j; k++){
                //     System.out.print(arr[k]+" ");
                //     sum = (i==0)?parr[j-1]:parr[j-1] - parr[i-1];
                // }
                //calculating sum of each sub-array using prefix array
                sum = (i==0)?parr[end]:parr[end] - parr[start-1];
                // System.out.print(sum+" ");
                // System.out.println();
                if (sum>max){
                    max = sum;
                }
            }
            // System.out.println();
        }
        System.out.println(max);
    }




    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        // int ans = maxSum(arr);
        // System.out.println("Max-sub array sum = "+ans);
        prefixArr(arr);
    }
}
