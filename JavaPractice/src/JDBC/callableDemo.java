package JDBC;

import java.sql.*;

public class callableDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection con = DriverManager.getConnection(url,"root","Admin@123");
            String sql = "{call getEmp1(?,?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1,101);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3,Types.FLOAT);
            cs.execute();
            System.out.println("employee details : ");
            System.out.println("Name : " + cs.getString(2));
            System.out.println("Salary : "+cs.getFloat(3));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
