/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DatabaseHelper {
    public DatabaseHelper(){}
    
    public static Connection openConnection() 
        throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;database=BAIGUIXE;";
            String dbusername = "sa";
            String password = "123456";
            Connection con = DriverManager.getConnection(connectionUrl,dbusername,password);
            return con;
    }
}
