package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployee {
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
            String sql = "insert into employee values("+id+",'"+name+"',"+salary+")";
            Statement st = con.createStatement();
            int rows = st.executeUpdate(sql);
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



    // accept id from user if it is present than salary increase by 10% else print not present 

