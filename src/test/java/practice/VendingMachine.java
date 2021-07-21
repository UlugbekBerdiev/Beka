package practice;

import net.bytebuddy.implementation.bytecode.Throw;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    /*
    input bill 1$   5$    10$

    * whater ---V1-----price 1.89$
    *
    * soda -----B2 ----price 1.49$
    *
    * gum ------B3------price 0.99$
    * */
    public static void main(String[] args) {

        vending(5, "V1");
    }

    static void vending(int bill, String code) {

        if (bill == 1 || bill == 5 || bill == 10) {
            double priceWhater = 1.89;
            double change = bill - priceWhater;
            int quater = (int) (change / 0.25);

            System.out.println("succes");
            Map<String, Double> map = new HashMap<>();
            map.put("V1", priceWhater);
            map.put("B2", 1.49);
            map.put("B3", 0.99);

            if (map.containsKey(code) && bill >= map.get(code)) {

                System.out.println("Whater " + "change - " + quater + " quater");

            } else System.out.println("price = " + priceWhater + "$ " + "curent balanc = " + bill);

        } else throw new ArithmeticException("Invalid bill type, please input 1$ or 3$ or 5$");
    }

}
