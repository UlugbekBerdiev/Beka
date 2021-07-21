package javaCodingTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factorial {
    public static void main(String[] args) {
        factorial(5);
        List<String> list = new ArrayList<>();
        list.add("list");
        list.add("promo");
        revByindex(list, 0,1);

    }


    static void factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
             fact = fact*i;                // 1 = 1*1 == 1    1 = 1*2 ==2   2 = 2*3 =6;  6= 6*4 =24;  24 = 24*5 =120

        }
        System.out.println(fact);
    }

    static void revByindex(List<String> list, int a, int b){
       if(list.size()-1>=a && list.size()-1>=b) {

           String temp = list.get(a);
           list.set(a, list.get(b));

           list.set(b, temp);
           System.out.println(list);
       }
        System.out.println("index not exist ");
    }

    public static ArrayList<Object> swap(int elem1, int elem2, ArrayList<Object> list) {

            Object temporary = list.get(elem1);
            list.set(elem1, list.get(elem2));
            list.set(elem2, temporary);
            return list;

    }
}
