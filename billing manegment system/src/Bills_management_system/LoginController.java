/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bills_management_system;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m639a
 */
public class LoginController extends dataConnection
{
    LoginController()
    {
        try
        {
            getConnected("Select * from dbo.Users");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public String login(String usr, String pwd)
    {
        String acc = "e";
        int id;
        
        try
        {
            getConnected("Select * from dbo.Users");
            while(res.next())
            {
                if(usr.equals(res.getString("Username")) 
                        && pwd.equals(res.getString("Password")))
                {
                    id = res.getInt("UserID");
                    acc = res.getString("UserType");

                    CurrentUser.usrid = id;
                    
                    break;
                }
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return acc;
    }
    
    public int register(String usr, String pwd)
    {
        int max = 0;
        try 
        {
            command = con.prepareStatement("Select Max(UserID) As ID from dbo.Users");
            res = command.executeQuery();
            while(res.next())
            {
                max = res.getInt("ID");
            }
            command = con.prepareStatement("Insert into dbo.Users Values(?, ?, ?, "
                    + "'empty', 'C', 'empty', 'empty', 'empty')");
            command.setInt(1, max+1);
            command.setString(2, usr);
            command.setString(3, pwd);
            command.executeUpdate();
            return 1;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
