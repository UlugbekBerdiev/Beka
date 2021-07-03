package JDBC_practice;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Day_1 {



    public static void main(String[] args) throws Exception {


 JDBCexecuteQuery("INSERT INTO records values('23415','1','2','TUda','2021-11-11','1.23','2021-11-11','1.23','13.4')");


//        res.next();
//        List<String> list = new ArrayList<>();
//        for (int i = 1; i <= res.getMetaData().getColumnCount(); i++) {
//            list.add(res.getString(i));
//        }
//        System.out.println(list);
    }

    public static void JDBCexecuteQuery(String query){
        try{
       String url = "jdbc:mysql://database-1.cbf9mjnqgnfr.us-east-2.rds.amazonaws.com:3306/stock_trading_tracker";
       String userName = "admin";
       String password = "Password123!";
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement statement = con.createStatement();
        statement.execute(query);
            System.out.println("Succes");
    }catch(Exception e){}
    }



}



//        res.next();
//        res.next();
//        System.out.println(res.getString(1));
//        String symbol = res.getString("symbol");
//        String date = res.getString("open_date");
//        System.out.println(date );
//        System.out.println(symbol);
//        res.next();

//        Faker faker = new Faker();
//       for(int i=2001; i<5000; i++) {
//           String symbol = faker.country().currency();
//          int id = faker.address().hashCode();
//           String update = "INSERT INTO records values('"+i+"','1','2','" + symbol + "','2021-01-01','1.23','2021-01-01','1.23','13.4')";
//
//           statement.execute(update);





