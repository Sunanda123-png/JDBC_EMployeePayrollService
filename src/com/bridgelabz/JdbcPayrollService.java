package com.bridgelabz;
import java.sql.*;
public class JdbcPayrollService {
    public static void main(String[] args) throws Exception{

            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/payroll_service1";
            String username="root";
            String password="1234";
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stat= con.createStatement();
            String sql="update Employee3 set salary=3200000 where id=5";
            stat.executeUpdate(sql);
            System.out.println("Done");
            stat.close();
            con.close();

    }
}
