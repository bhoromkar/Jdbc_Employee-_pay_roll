package com.bridgelabz;

import java.sql.*;

public class JdbcDemo {

    static final String DB_URL = "jdbc:mysql://localhost:3306/employee_payroll_ONE";
    static final String USER = "root";
    static final String PASS = "Omkar@20";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = null;
//            stmt = conn.prepareStatement("select * from employee where id>=? and gender=?");
            stmt = conn.prepareStatement("insert into employee(name,location,gender) values(?,?,?)");
            stmt.setString(1, "pqr");
            stmt.setString(2, "mumbai");
            stmt.setString(3, "f");
//            ResultSet rs = stmt.executeQuery();
        int count =    stmt.executeUpdate();
            System.out.println(count);
//            int count = stmt.executeUpdate("insert into employee(name,location,gender) values('om','pune','m'),('vinita','p','f'),('xyz','mumbai','m'),('abcd','pimpari','m')");
// Extract data from result set
//                while (rs.next()) {
//                    // Retrieve by column name
//                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//
//
//                }
        } catch (SQLException e) {
            System.out.println("catch");
        }
    }
}