package com.mkyong.hashing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testing {
    private final static String JDBC_URL = "jdbc:mysql://ec2-54-169-248-237.ap-southeast-1.compute.amazonaws.com:3306/" + "test";

    private final static String DB_USER = "admin";

    private final static String DB_PASSWORD = "123@Admin";

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Connection mySQLClient = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
