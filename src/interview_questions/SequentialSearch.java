package interview_questions;

public class SequentialSearch {

    public static int linearSearch(int[] arr, int target){
        int size = arr.length;
        for(int i=0; i<=size; i++)
            if(arr[i] == target)
                return i;

        return -1;
    }
    public static void main(String[] args){
        int[] sampleArr = {10, 20, 30, 40, 50};
        System.out.println(linearSearch(sampleArr, 40));
    }

}
