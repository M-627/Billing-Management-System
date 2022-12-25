/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bills_management_system;

import java.sql.SQLException;

/**
 *
 * @author m639a
 */
public class AdministratorController extends dataConnection
{
    public String setAdministrator()
    {
        String userName = "USER";
        try
        {
            getConnected("Select * from dbo.Users");
            command = con.prepareStatement("Select dbo.Users.Username As name from dbo.Users Where (UserID = ?)");
            command.setInt(1, CurrentUser.usrid);
            res = command.executeQuery();
            while(res.next())
            {
                userName = res.getString("name");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return userName;
    }
}
