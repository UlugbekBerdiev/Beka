package practice;

import java.util.ArrayList;
import java.util.List;

public class Task_from_muhamed {

    public static void main(String[] args) {

        String[] arr = {"Beka Berdiev", "Beka AL Berdiev", "Uegbek El Berdiev", "Berdiev Beka", "Dima Sergeevich Gorbunov"};

        System.out.println(task(arr));


    }
    static List<String> task(String[] arr){

        List<String> list = new ArrayList<>();
    for(String each : arr){
         if(each.replaceAll(" ", "").length()==each.length()-1){
             list.add(each);
         }

    }
    return  list;
    }

        }