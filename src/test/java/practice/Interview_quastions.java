package practice;

import org.testng.annotations.Test;

public class Interview_quastions {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 5};
        int[] arr2 = {2, 3, 4, 5, 5};
        sumOfAllNumberFromTwoArray(arr1, arr2);
        Fibonacci(10);
             }

    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " "); //0  | 1 | 1 | 2 | 3 |

            // Swap
            int num3 = num2 + num1;  //    0+1   2      3    5   8
            num1 = num2;              // 1       1      2    3
            num2 = num3;             // 1        2      3    5
            counter = counter + 1;      //1      2      3    4
        }
    }
    public static void sumOfAllNumberFromTwoArray(int[] arr1, int[] arr2){
        int sum =0;
        for(int i=0; i<arr1.length; i++){
            sum+=arr1[i]+arr2[i];
        }
        System.out.println("sum Of All Numbers From Two Array = "+ sum);
    }


}
/*
*      a= 3;
*      b= 2
*
*      c=b+a;   ----5
*      b=a+c    ----8
*      b=c+b    ----13
*      c=c+b    ----21
*
*
*

*
*
*
*
* */