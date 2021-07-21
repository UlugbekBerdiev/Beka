package javaCodingTasks;

import java.util.Arrays;
import java.util.List;

public class AnagramStrings {

    public static void main(String[] args) {
        System.out.println(siAnagram("army", "ymra"));
    }

    static boolean siAnagram(String str1, String str2){

        char[] arr1=str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
              return true;
        }else return false;

    }


}
