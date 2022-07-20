/**
 *
 *  An implementation of Binary Search from scratch as described in
 *  Cracking the Coding Interview video series
 */

public class BinarySearch {

    public static int binarySearch(int[] arr, int value){
        // declare parameters that will change
        // NOTE: Since we are dealing with array indices, hence the value of low and high
        int mid;
        int low = 0;
        int high = arr.length - 1 ;

        while (low <= high){  // what does this condition do
            mid = low + (high - low)/2;       // To prevent overflow
            if(arr[mid] == value)
                return mid;
            else if (arr[mid] <  value)
                    low = mid + 1;
            else
                high = mid - 1;

        }
        return -1 ;
    }
    // Driver code
    public static void main(String [] args){
        System.out.println("Binary search >>");
        int[] arrNums = {10,20,30,40,50,60};
        System.out.println(binarySearch(arrNums, 90));

    }
}
