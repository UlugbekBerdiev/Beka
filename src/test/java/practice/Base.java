package practice;

public interface Base {


   public static final int name =1;





   default void name(){
        System.out.println("Hello");

    }

  default void print(){}


   int num=1;

    static void main(String[] args) {

    }

    public abstract void run();
}
