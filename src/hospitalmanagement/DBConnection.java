/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rijo0
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection con=null;
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/hospital_db";
            String user="root";
            String password="YOUR_SQL_PASSWORD";
            
            con=DriverManager.getConnection(url,user,password);
            System.out.println("Database connected successfully!");
        }
        
        catch(Exception e){
            System.out.println("Database creation failed!");
            e.printStackTrace();}
        
        return con;
}
}
