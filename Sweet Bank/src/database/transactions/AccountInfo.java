/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import database.DbSource;
import database.IInfoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karaarslan
 */
public class AccountInfo extends DbSource implements IInfoController{
    
    /**
     * Singleton Object
     */
    
    private static AccountInfo accountInfo = null;
    
    public static AccountInfo getInstance()
    {
        if(accountInfo == null)
        {
            accountInfo = new AccountInfo();
           
        }
        return accountInfo;
    }

    @Override
    public AccountInfo getAccountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isInfoValid() {
        return !(super.user_ID == 0);
    }
    
    
    
    public void login(String userID)
    {
        this.getUser(userID);
        this.getbalance();
        this.getbills();
    }
    
    //Get User Account Infos
    
    private void getUser(String userID)
    {
        String query = "SELECT * FROM Users WHERE "
                + " id_number = '" + userID + "'"
                + " OR "
                + " custom_number = '" + userID + "'";
        
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
             while(rs.next())
            {
                super.user_ID = rs.getInt("user_ID");
                super.name_Surname = rs.getString("name_surname");
                super.id_Number = rs.getString("id_number");
                super.phone_Number = rs.getString("phone_number");
                super.custom_No = rs.getString("custom_number");
            }
           } 
        catch (SQLException ex) {
            Logger.getLogger(AccountInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void getbalance()
    {
        if(this.isInfoValid())
        {
            String query = "SELECT * FROM User_Balance "
                    + "WHERE "
                    +"user_ID = '" + super.getUser_ID()+ "'";
            
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next())
                {
                    super.balance = rs.getDouble("balance");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    private void getbills() 
    {
        if(this.isInfoValid())
        {
            String query = "SELECT * FROM User_Bills "
                    + " WHERE "
                    +" user_ID = '" + super.getUser_ID()+ "'";
            
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next())
                {
                    super.electricty_bill = rs.getDouble("electricity");
                    super.water_bill = rs.getDouble("water");
                    super.gas_bill = rs.getDouble("gas");
                    super.internet_bill = rs.getDouble("internet");
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
