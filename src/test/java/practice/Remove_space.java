package practice;

public class Remove_space {
    public static void main(String[] args) {
        String input = "Try  to   remove   extra spaces.";
        String inputNew = input;
        while (inputNew.contains("  ")) {
            inputNew = inputNew.replace("  ", " ");
        }
        System.out.println(input);
        System.out.println(inputNew);
    }
}
