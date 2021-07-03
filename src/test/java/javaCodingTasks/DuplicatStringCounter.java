package javaCodingTasks;

import java.util.HashMap;
import java.util.Map;

public class DuplicatStringCounter {

    public static void main(String[] args) {

        String str = "two One One two One 2 2 2 2";
        countDuplicate(str);

    }
/**
 *       ---- Bellow you will see a method named "countDuplicate()"
 *      This method printing ho many time each word has been duplicated.
 *      The method working perfect according requarments.
 *
 *      Problem:-- I know this task has several solutions.
 *                 But, I want you optimize this code to avoid a repetitions of loops.
 *
 *                 Pleas dot't copy past from google.... Enjoy
 *
 *                 p.s. I don't know how to do it.....
 *
 *
 * **/

    static void countDuplicate(String str) {
        //spliting to array of string base on space
        String[] arr = str.split(" ");

        //create one map to use it
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            map.put(each, 1);                 //add unique string in to key which not allowed duplicate
        }

        for (String each : arr) {
            if (map.containsKey(each)) {           //conditions said if our map is contains a string it means it is duplicate string
                map.put(each, map.get(each) + 1);  // then jump inside if and update a key and increase value by 1;
            }

        }
        for (String each : map.keySet()) {     //looping set of value to decrease value of maps key by 1;
            int a = map.get(each) - 1;        //integer stored a actual value after decreasing;
            map.put(each, a);                 //update kay and value according new value.
        }

        System.out.println(map);             // print out map
    }


}



