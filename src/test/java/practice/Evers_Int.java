package practice;

public class Evers_Int {

    public static void main(String[] args) {
        int num = 12345;
        int result=0;

        result = num % 10;

      num = num / 10;
      result = result * 10 + num % 10;

        System.out.println(result);



    }
}
