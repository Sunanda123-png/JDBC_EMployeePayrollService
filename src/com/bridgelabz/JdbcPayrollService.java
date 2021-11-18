package com.bridgelabz;
import java.sql.*;

public class JdbcPayrollService {
    public static void main(String[] args){
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/payroll_service";
            String username="root";
            String password="1234";
            Connection con=DriverManager.getConnection(url,username,password);

            if (con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection is created");
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
