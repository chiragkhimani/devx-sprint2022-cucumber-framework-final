package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseUtils {
    public static void main(String[] args) throws Exception {
        // 1. Connect to the Database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "root", "Trust@123");

        // 2. Query the Database
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select first_name from employees;");

        // 3. Process the result / Print the result
        while(result.next()){
            System.out.println(result.getString(1));
        }

        // 4. Close the connection
        con.close();

    }
}
