package JDBC_practice;

import java.sql.*;

public class Day_1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://database-1.cbf9mjnqgnfr.us-east-2.rds.amazonaws.com/";
        String userName = "admin";
        String password = "Password123!";
        String query = "select * from records";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,userName,password);

       Statement statement = con.createStatement();
        ResultSet res = statement.executeQuery(query);
        res.next();
        String symbol = res.getString("symbol");
        System.out.println(symbol);
        statement.close();
        con.close();
    }

    }

