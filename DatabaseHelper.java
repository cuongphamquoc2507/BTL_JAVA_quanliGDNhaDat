/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author 54321
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=NhaDat;user=sa;";
        String dbusername="sa";
        String password="abc@123";
        Connection con=DriverManager.getConnection(connectionUrl, dbusername, password);
        return con;
     
    }
}
    

  
    

