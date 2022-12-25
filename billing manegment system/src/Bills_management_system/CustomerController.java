/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bills_management_system;

import java.sql.*;

/**
 *
 * @author m639a
 */
public class CustomerController extends dataConnection
{
    public String setCustomer()
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
    
    public String getBillsCount()
    {
        int count = -3;
        try
        {
            getConnected("Select * from dbo.Bills");
            command = con.prepareStatement("Select Count(dbo.Bills.BillID) As Count from dbo.Account Inner Join "
                    + "dbo.Bills on dbo.Account.AccountID = dbo.Bills.AccountID Where dbo.Account.UserID = ?");
            command.setInt(1, CurrentUser.usrid);
            res = command.executeQuery();
            while (res.next())
            {
                count = res.getInt("Count");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Integer.toString(count);
    }
    
    public String getBillsCost()
    {
        int cost = 90909;
        try
        {
            getConnected("Select * from dbo.Bills");
            command = con.prepareStatement("Select Sum(dbo.Bills.TotalCost) As Cost from dbo.Account Inner Join "
                    + "dbo.Bills on dbo.Account.AccountID = dbo.Bills.AccountID Where dbo.Account.UserID = ?");
            command.setInt(1, CurrentUser.usrid);
            res = command.executeQuery();
            while (res.next())
            {
                cost = res.getInt("Cost");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Integer.toString(cost);
    }
    
    public ResultSet getBills()
    {
        try
        {
            getConnected("Select * from Bills");
            command = con.prepareStatement("Select dbo.Account.AccountName, dbo.Company.CompanyName,"
                    + " dbo.Bills.TotalCost, dbo.Bills.Tax, dbo.Bills.UploadingDate,"
                    + " dbo.Bills.Status, dbo.Bills.PaymentDate from dbo.Bills Inner Join "
                    + "dbo.Account on dbo.Bills.AccountID = dbo.Account.AccountID Inner Join "
                    + "dbo.Company on dbo.Account.CompanyID = dbo.Company.CompanyID Where dbo.Account.UserID = ?");
            command.setInt(1, CurrentUser.usrid);
            res = command.executeQuery();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return res;
    }
}
