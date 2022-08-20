package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseUtils {
    static Connection con;

    public static void initDatabase() throws Exception {
        // 1. Connect to the Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "root", "Trust@123");
    }

    public static ResultSet executeQuery(String query) throws Exception{
        // 2. Query the Database
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery(query);
        return result;
    }

    public static void closeConnection() throws Exception{
        // 4. Close the connection
        con.close();
    }

}
