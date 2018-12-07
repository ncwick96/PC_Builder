// This script pulls info from a sql database, sorts the data, and "builds" different "computers" based
// on User input.
// CNA 330
// Nathan Wick, and Parker Swift, ncwick@student.rtc.edu, pdswift@student.rtc.edu

import com.sun.jdi.Value;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Variable;
import jdk.dynalink.beans.StaticClass;

import java.io.Reader;
import java.util.*;
import java.sql.*;
import java.util.Scanner;


public class Main {
//  class Computer {}
//
//  class Case extends Computer {}
//  class MoBo extends Case {}
//  class CPU extends MoBo {}
//  class RAM extends CPU {}
//  class PSU extends MoBo {}
//  class Heat extends CPU {}


// referenced from https://docs.oracle.com/javase/tutorial/jdbc/overview/index.html
  public class LoadDriver {
    public void main(String[] args) {
      try {

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


    } catch (SQLException ex) {
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

    Scanner scanner = new Scanner(System.in);
    String Date = scanner.next();
    String Name = scanner.next();
    String Cat = scanner.next();
    String Quan = scanner.next();
    String Model = scanner.next();
    String Mfg = scanner.next();
    String Price = scanner.next();
    String Site = scanner.next();


    List<String> Components = new ArrayList<>();
    Components.add(Name);
    Components.add(Cat);
    Components.add(Quan);
    Components.add(Model);
    Components.add(Mfg);
    Components.add(Price);
    Components.add(Site);
    Components.add(Date);


    if (Cat == "RAM")

      class Name extends RAM{};
      class Date extends Name{};
      class Quan extends Name{};
      class Model extends Name{};
      class Price extends Name{};
      class Site extends Name{};

  }



                                                                                }
// SQL Columns:
// ID, Date, Name, Class, Quantity, Model, Manufacturer, Price, Site


//  List Computer_components
//          if (MoBo == partString)
//Mobo mobo = new MoBo
//PCcomp.add(MoBo)
//
//
//List Computers
//
//}
//computers.add(computers)