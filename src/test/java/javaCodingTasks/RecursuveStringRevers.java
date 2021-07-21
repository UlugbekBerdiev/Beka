package javaCodingTasks;

public class RecursuveStringRevers {

    public static void main(String[] args) {
        String text = rev("Tools");
        System.out.println(text);

    }


    public static String rev(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return rev(str.substring(1)) + str.charAt(0);
    }
}
