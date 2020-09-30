
package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection c;
    public static Statement s;
    static{
    try{
         Class.forName("com.mysql.jdbc.Driver");
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/paynet","root","");
         s=c.createStatement();
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
}
}
