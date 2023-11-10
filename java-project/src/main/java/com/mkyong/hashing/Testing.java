package com.mkyong.hashing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testing {
    // private final static String JDBC_URL =
    // "jdbc:mysql://ec2-54-169-248-237.ap-southeast-1.compute.amazonaws.com:3306/"
    // + "cloudcomputing";
    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/" + "clouddatabase";
    private final static String DB_USER = "root";

    private final static String DB_PASSWORD = "1931200013";

    public static void main(String args[]) {
//done

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Connection mySQLClient = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            PreparedStatement st = mySQLClient.prepareStatement("SELECT COUNT(*) as count FROM customer");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("count"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
