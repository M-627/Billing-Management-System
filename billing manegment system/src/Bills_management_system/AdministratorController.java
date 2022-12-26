/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bills_management_system;

import java.sql.Date;
import java.sql.ResultSet;
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
    
    public ResultSet getBills()
    {
        try
        {
            getConnected("Select * from Bills");
            command = con.prepareStatement("Select dbo.Bills.BillID, dbo.Users.FirstName, dbo.Users.Last_Name, "
                    + "dbo.Customer.NationalID, dbo.Bills.UploadingDate, dbo.Bills.Status, "
                    + "dbo.Bills.PaymentDate from dbo.Bills Inner Join dbo.Administrator on "
                    + "dbo.Administrator.CompanyID = dbo.Bills.CompanyID Inner Join dbo.Account on "
                    + "dbo.Account.CompanyID = dbo.Administrator.CompanyID Inner Join dbo.Customer on "
                    + "dbo.Customer.UserID = dbo.Account.UserID Inner Join dbo.Users on "
                    + "dbo.Users.UserID = dbo.Customer.UserID Where (dbo.Administrator.UserID = ?)");
            command.setInt(1, CurrentUser.usrid);
            res = command.executeQuery();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return res;
    }
    
    public ResultSet filterBills(String query)
    {   
        String and = "";
        if (!query.isEmpty())
            and = " AND ";
                
        try
        {
            getConnected("Select * from Bills");
            command = con.prepareStatement("Select dbo.Bills.BillID, dbo.Users.FirstName, dbo.Users.Last_Name, "
                    + "dbo.Customer.NationalID, dbo.Bills.TotalCost, dbo.Bills.UploadingDate, dbo.Bills.Status, "
                    + "dbo.Bills.PaymentDate from dbo.Bills Inner Join dbo.Administrator on "
                    + "dbo.Administrator.CompanyID = dbo.Bills.CompanyID Inner Join dbo.Account on "
                    + "dbo.Account.CompanyID = dbo.Administrator.CompanyID Inner Join dbo.Customer on "
                    + "dbo.Customer.UserID = dbo.Account.UserID Inner Join dbo.Users on "
                    + "dbo.Users.UserID = dbo.Customer.UserID Where dbo.Administrator.UserID = ?" + and + query);
            command.setInt(1, CurrentUser.usrid);
            res = command.executeQuery();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return res;
    }
    
    public ResultSet customerIDBills(String input)
    {
        String query = "' " + input + " '";
        res = filterBills("dbo.Customer.NationalID = " + query);
        return res;
    }
}
