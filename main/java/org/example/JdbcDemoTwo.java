package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemoTwo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll_ONE", "root", "Omkar@20");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from employee");
//            while (rs.next())
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

//            int count = stmt.executeUpdate("insert into employee(name,location,gender) values('om','pune','m'),('vinita','p','f'),('xyz','mumbai','m'),('abcd','pimpari','m')");
//            System.out.println(count);

            boolean response = stmt.execute("update employee set name= 'paq' where id = 7");
//
            if (response) {
                ResultSet rs = stmt.getResultSet();
                while (rs.next())
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }else {
                int count = stmt.getUpdateCount();
                System.out.println(count);

            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
