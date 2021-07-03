package practice;

public class ArrayDuplicateFindeder {

    public static void main(String[] args) {
        //You are given two Arrays [3, 11, 23, 56, 2, 7] and [5, 7, 44, 23, 56].
        // Write a method that will return the
        // number of matching elements in these arrays. Next question: how will
        // you return the non-matching numbers from both arrays?
        int[] arr1 = {3, 11, 23, 56, 2, 7};
        int[] arr2 = {5, 7, 44, 23, 56};


        System.out.println(numberOfMatchingNumber(arr1,arr2));


    }

    public static int numberOfMatchingNumber(int[] arr1, int[] arr2){
        int count=0;
        for(int each : arr1){

            for(int i=0; i < arr2.length; i++){
                if(each==arr2[i]){
                 count++;
                }}}
       return count;
    }

}
