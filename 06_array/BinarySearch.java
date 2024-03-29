public class BinarySearch {

    public static int search(int arr[],  int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){

            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int key = 4;

        int result = search(arr,key);
        if(result == -1){
            System.out.println("not found");
        }else{
            System.out.println("index = "+result);
        }

    }
}
