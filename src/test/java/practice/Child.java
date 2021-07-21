package practice;

public class Child implements Base {

    static String name = "Beka";


    @Override
    public void print() {
        System.out.println(num);
    }


    public static void main(String[] args) {
        Child obj = new Child();

        obj.print();
        System.out.println(false^true);
        float num1 = (float) 41.2;
        double dob = 123124.2;
        num1 = (float) dob;
        char t = 74;
        short p = 'a';
        char a = (short) 1;
        int g = 'A';
        byte h = 'a';
        long l = 100_000_000_00l;

    }

    @Override
    public void run() {

    }
}
