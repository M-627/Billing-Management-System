    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

import java.sql.*;

/**
 *
 * @author mariam
 */
public abstract class dataConnection {

    public dataConnection(){    
    }
    
    public static String url = "jdbc:sqlserver://localhost\\MADAN\\MSSQLSERVER01:1433;databaseName=BMS_DB";
    public static String uname = "sa";
    public static String pass = "4St0rm1s4ppr04ch1ng";
    Connection con = null;
    Statement smt = null;
    ResultSet res = null;
    PreparedStatement command = null;

    public Connection getCon() {
        return con;
    }

    public Statement getSmt() {
        return smt;
    }

    public ResultSet getRes() {
        return res;
    }

    public PreparedStatement getCommand() {
        return command;
    }
    
    
    
    public void getConnected(String query) throws ClassNotFoundException, SQLException
    {
        try
        {
            con = DriverManager.getConnection(url, uname, pass);
            smt = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE
                    , ResultSet.CONCUR_UPDATABLE);
            res = smt.executeQuery(query);
            System.out.println("Connection Successful!");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
