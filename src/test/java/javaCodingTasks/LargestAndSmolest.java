package javaCodingTasks;

public class LargestAndSmolest {


    public static void main(String[] args) {

        int[] arr = {1, 3, 56, -3, 54, 7, 3, 6};

        int largest = 0;
        int smallest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];

            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(largest + "  " + smallest);


    }
}
