package javaCodingTasks;

public class NumberOfCharinString {

    public static void main(String[] args) {
        String str = "polindrom";
        System.out.println(countNumberOf(str, "o"));

    }

    static int countNumberOf(String str, String later){

       return str.length()-str.replaceAll(later, "").length();
    }
}
