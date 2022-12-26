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
                    + "dbo.Customer.NationalID, dbo.Bills.TotalCost, dbo.Bills.UploadingDate, dbo.Bills.Status, "
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
    
    
    public ResultSet filterBills(String nat, Date date, boolean status, String cost, String bill )
    {
        String natPart = " AND dbo.Customer.NationalID = ?";
        String datePart = " AND dbo.Bills.UploadingDate = ?";
        String statusPart = " AND dbo.Bills.Status = ?";
        String costPart = " AND dbo.Bills.TotalCost = ?";
        String billPart = " AND dbo.Bills.BillID = ?";
        
        if (nat.isEmpty())
            natPart = "";
        
        if (date == null)
            datePart = "";
        
        if (!status)
            statusPart = "";
        
        if (cost.isEmpty())
            costPart = "";
        
        if (bill.isEmpty())
            billPart = "";
                
        try
        {
            getConnected("Select * from Bills");
            command = con.prepareStatement("Select dbo.Bills.BillID, dbo.Users.FirstName, dbo.Users.Last_Name, "
                    + "dbo.Customer.NationalID, dbo.Bills.TotalCost, dbo.Bills.UploadingDate, dbo.Bills.Status, "
                    + "dbo.Bills.PaymentDate from dbo.Bills Inner Join dbo.Administrator on "
                    + "dbo.Administrator.CompanyID = dbo.Bills.CompanyID Inner Join dbo.Account on "
                    + "dbo.Account.CompanyID = dbo.Administrator.CompanyID Inner Join dbo.Customer on "
                    + "dbo.Customer.UserID = dbo.Account.UserID Inner Join dbo.Users on "
                    + "dbo.Users.UserID = dbo.Customer.UserID Where dbo.Administrator.UserID = ?" 
                    + natPart + datePart + statusPart + costPart + billPart);
            command.setInt(1, CurrentUser.usrid);
            
            int i = 1;
            if(!nat.isEmpty())
                command.setInt(++i, Integer.parseInt(nat));
            
            if(date != null)
                command.setDate(++i, (java.sql.Date) date);
            
            if(status)
                command.setString(++i, "Unpaid");
            
            if(!cost.isEmpty())
                command.setInt(++i, Integer.parseInt(cost));
            
            if(!bill.isEmpty())
                command.setInt(++i, Integer.parseInt(bill));
            
            res = command.executeQuery();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return res;
    }
}
