package com.bridgelabz;
import java.sql.*;

public class JdbcPayrollService {
    public static void main(String[] args) throws Exception{

            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/payroll_service";
            String username="root";
            String password="1234";
            Connection con=DriverManager.getConnection(url,username,password);

            String query="select * from employee_payroll";
            Statement stat= con.createStatement();
            ResultSet set=stat.executeQuery(query);
            while(set.next()){
                int id =set.getInt(1);
                String name= set.getString(2);
                String gender= set.getString(3);
                int salary =set.getInt(4);
                Date date=set.getDate(5);
                System.out.println(id+";"+name+";"+gender+";"+salary+";"+date);

            }

            stat.close();
            con.close();

    }
}
