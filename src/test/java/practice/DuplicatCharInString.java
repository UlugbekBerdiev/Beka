package practice;

public class DuplicatCharInString {

    public static void main(String[] args) {
        //delete duplicate char in the String

        String str = "AABDSCD";

        //broot search
        String result = "";
        for(int i =0; i<str.length();i++){
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    result=result+str.charAt(j);

                }
            }

        }

        for(char each : result.toCharArray()){
            result= str.replaceFirst(each+"", "");
        }
        System.out.println(result);

         }
}
