package JDBC;

import java.sql.*;

public class GetEmployee {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Load Driver
            System.out.println("Driver Loaded!!");

            String url = "jdbc:mysql://localhost:3306/test";
            con = DriverManager.getConnection(url,"root","Admin@123");
            System.out.println("Connected!!!");
            String sql = "select * from employee";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);// Execute the query but the result rs will point
            // to the previous of the record

            while (rs.next()){ //rs.next() checks if there is any next record
                System.out.println("ID : "+rs.getInt(1));
                System.out.println("name : "+rs.getString(2));
                System.out.println("salary : "+ rs.getFloat("salary"));
                System.out.println("-----------------------");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (con!=null)//if connection is established then only close it
                   con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



    }
}
