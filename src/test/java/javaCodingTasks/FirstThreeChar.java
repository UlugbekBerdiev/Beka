package javaCodingTasks;

public class FirstThreeChar {

    public static void main(String[] args) {
        String[] arr = {"Monday", "Tusday"};

        System.out.println();
    }


    static String[] returnFirst3(String[] arr){
        String[] result = new String[arr.length];
        int a =0;
        for(String each : arr){
            result[a]=each.substring(0,3);
            a++;
        }

        return result;
    }
}
