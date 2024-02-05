public class Reference{

    public static int update(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] + 1;
        }

        return 0;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        update(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}