package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DBconnect {
   
    //Connection Class
    public static Connection connect(){
        Connection conn = null;
        try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cac_system","root","");
        }catch(Exception e){e.printStackTrace();}
        return conn;
    } 
}
