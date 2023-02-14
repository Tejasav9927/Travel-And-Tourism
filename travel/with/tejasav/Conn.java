/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.with.tejasav;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    

    Conn()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3307/travelmanagementsystem","root","Tejasav9927@");
            s=c.createStatement();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
