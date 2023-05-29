/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bse203027;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hamza Nadeem
 */
public class db {
    public static Connection mycon(){
       Connection con= null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?", "root","");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
       
       
       
       
       return con;
    }
}
