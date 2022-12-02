package interview_questions;

/**
 * very easy, you should use this as a warmup
 *
 */
public class ArraySum {

    public static int sumArray(int[] arr){
        int total = 0;
        for(int i=0; i<arr.length; i++)
            total += arr[i];

        return total;
    }

    public static void main(String [] args){
        int[] testArray = {10, 20, 30, 40, 50};
        System.out.println(sumArray(testArray));
    }
}
