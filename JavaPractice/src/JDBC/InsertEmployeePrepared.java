package JDBC;

import java.sql.*;
import java.util.Scanner;

public class InsertEmployeePrepared {
    Connection con;
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID : ");
            int id = sc.nextInt();
            System.out.println("Enter Name : ");
            String name = sc.next();
            System.out.println("Enter Salary : ");
            float salary = sc.nextFloat();

            Class.forName("com.mysql.cj.jdbc.Driver");//Load Driver
            System.out.println("Driver Loaded!!");

            String url = "jdbc:mysql://localhost:3306/test";
            Connection con = DriverManager.getConnection(url, "root", "Admin@123");
            System.out.println("Connected!!!");
            String sql = "insert into employee values(?,?,?)";// such queries are called parameterized queries
            //Statement st = con.createStatement();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2,name);
            ps.setInt(1,id);
            ps.setFloat(3,salary);
            int rows = ps.executeUpdate();//no query passing
            if (rows > 0) {
                System.out.println("Employee Record Inserted!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
