/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import com.mysql.cj.protocol.Resultset;
import database.DbConnection;
import database.IInfoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karaarslan
 */
public class UserLogin extends DbConnection implements IInfoController{

    private String userID = null;
    private String password = null;
    
    public boolean isLoginInfoValid()
    {
        if(isInfoValid())
        {
            if(isLoginSuccessfull())
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        else
        {
            return false;
        }
    }
    
    
    @Override
    public boolean isInfoValid() {
        return !(this.userID == null
                || this.password == null);
    }

    private boolean isLoginSuccessfull()
    {
        String query = "SELECT id_number,custom_number,password FROM Users"
                + "WHERE "
                + "(id_number='"+this.userID + "'"
                + " OR "
                + "custom_number = '" + this.userID + "')"
                + " AND "
                + "password = '" + this.password + "'";
        
       try{ 
        super.statement = super.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while(rs.next())
        {
            return true;
        }
       }
       catch(SQLException ex)
       {
          Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
       }
       return false;
       
    }
    
    @Override
    public AccountInfo getAccountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
