package javaCodingTasks;

import java.util.HashMap;
import java.util.Map;

public class DuplicatString {
    public static void main(String[] args) {


        String dupl = "My name is Beka Beka and My last name is Berdiev";
        duplacate(dupl);
    }

    static void duplacate(String str){
        String[] arr = str.split(" ");
        int count =1;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], count);

            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }

        }

          for(String each : map.keySet()){
              if(map.get(each)>1){
                  System.out.println(each + "=" + map.get(each));
              }
          }
    }
}
