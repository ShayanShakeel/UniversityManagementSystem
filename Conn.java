 
package package1;

import java.sql.*;

public class Conn{
    
    Connection c;
    Statement stmt;
    
    Conn()
    {
        try {
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","");
        stmt=c.createStatement();
        
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
