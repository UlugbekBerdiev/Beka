package javaCodingTasks;

import java.util.*;

public class RemoveDuplString {
    public static void main(String[] args) {


        String names = "Beka Beka Dima Lubomir Dima";

        String[] input = names.split(" ");

        Set<String> set = new HashSet<>(Arrays.asList(input));
        for(String each : set){
            System.out.print(each+" ");
        }


    }
}
