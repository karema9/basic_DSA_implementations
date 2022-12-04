package interview_questions;

public class UniqueCharacters {
    public static boolean isUniqueStr(String str){
        if(str.length() > 128) return false;


        boolean[] arr_flags = new boolean[128];

        // loop through the array
        for (int i = 0; i < str.length(); i++)
            // int strIndex = str.charAt(i);
            System.out.println(str.charAt(i));

        return false;
    }

    public static void main(String[] args){
        String name = "JP3";
        System.out.println(isUniqueStr(name));
    }
}
