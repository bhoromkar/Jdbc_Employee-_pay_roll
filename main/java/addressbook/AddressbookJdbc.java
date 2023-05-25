package addressbook;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AddressbookJdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Address_Book_Services", "root", "Omkar@20");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from address_book");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9));
//            }
//            int count = stmt.executeUpdate("insert into address_book(first_name,Last_name,address,city,state,zipcode,phone,email)values('kmgljf','dkgkr','xyzbhk','pune','mh','411039','9890810104','abc.b@gmail.com')");
//           System.out.println(count)
//           DateTime startDate = new DateTime(2023, 4, 1); // Start date of the period
//DateTime endDate = new DateTime(2023, 4, 30); // End date of the period
//
//            Result rs1 = (Result) stmt.executeQuery("SELECT * FROM Contacts WHERE date_added BETWEEN @StartDate AND @EndDate");
//;
//            ResultSet rs = stmt.executeQuery("select * from address_book where city = 'pune'");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9));
//          }

        } catch (Exception e) {
            System.out.println("catch");
        }
    }
}
