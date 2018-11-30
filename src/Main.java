// This script pulls info from a sql database, sorts the data, and "builds" different "computers" based
// on User input.
// CNA 330
// Nathan Wick, and Parker Swift, ncwick@student.rtc.edu, pdswift@student.rtc.edu

import java.sql.*;

public class Main {

  public class LoadDriver {
    public void main(String[] args) {
      try {
        // The newInstance() call is a work around for some
        // broken Java implementations

        Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (Exception ex) {
        // handle the error
      }
    }
  }

  public static void main(String[] args) {

      //Code referenced from https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-
      // connect-drivermanager.html#connector-j-examples-connection-drivermanager


      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;

      try {
        conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/Computer_Parts" +
                        "user=root&password=");
        rs = stmt.executeQuery("SELECT * FROM Computer_Parts");
        System.out.println(rs);


      }
      catch (SQLException ex) {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
      }
      //try {
      // stmt = conn.createStatement();
      // }
      //catch (SQLException ex) {
        // handle any errors
      //  System.out.println("SQLException: " + ex.getMessage());
      //  System.out.println("SQLState: " + ex.getSQLState());
      //  System.out.println("VendorError: " + ex.getErrorCode());
      // }






        //Code referenced from https://stackoverflow.com/questions/1559440/combining-java-with-sql {
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM Computer_Parts");
//        while (rs.next()) {
        //rs contains the result of the query
        //with getters you can obtain column values
//        int x = rs.getInt("a");
//        String s = rs.getString("b");
//        float f = rs.getFloat("c");
      //                                                                                      }

      }
    }

