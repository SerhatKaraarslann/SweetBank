/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;


import database.DbConnection;
import database.IInfoController;
import gui.settings.TextSettings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karaarslan
 * 
 */
public class UserApplication extends DbConnection implements IInfoController{

   
   
    //Application infos
    private String nameSurname = null;
    private String idNumber = null;
    private String phoneNumber = null;
    private String securityQuestion = null;
    private String securityAnswer = null;
    
    
    //The infos, gaven by systems
    private String customNo = null;
    private String password = null;
    
     public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public String getCustomNo() {
        return customNo;
    }

    public String getPassword() {
        return password;
    }

 
    
    
       @Override
    public boolean isInfoValid() {
        return !(this.nameSurname == null || this.idNumber == null
                || this.phoneNumber == null || this.securityQuestion == null
                || this.securityAnswer == null || this.customNo == null
                || this.password == null
                ||TextSettings.isLengthLessThan(11, this.idNumber)
                || TextSettings.isLengthLessThan(11, this.phoneNumber)
                );
    }

    @Override
    public AccountInfo getAccountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isApplicationApproved() {
        if(this.isInfoValid())
        {
            if(this.isIdNumberInTabel())
            {
                return false;
            }
            else
            {
                this.approveApplication();
                return true;
                     
            }
        }
        else
        {
            return false;
        }
       
    }
    
    private boolean isIdNumberInTabel()
    {
        String query = "SELECT ID_Number FROM Users WHERE ID_Number = '" +this.idNumber+ "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
                         
            while(rs.next())
            {
                return true; // if the data in tabel was found, return true
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    public boolean isCustomNoInTabel()
    {
        String query = "SELECT Custom_Number FROM Users WHERE Custom_Number = '" +this.customNo+ "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    private void approveApplication()
    {
        String query = "INSERT INTO Users(Custom_Number,Password,"
                +"Name_Surname,ID_Number,Phone_Number,Security_Question,Security_Answer)"
                +" Values("
                + "'"+this.customNo +"',"
                + "'"+this.password +"',"
                + "'"+this.nameSurname +"',"
                + "'"+this.idNumber +"',"
                + "'"+this.phoneNumber +"',"
                + "'"+this.securityQuestion +"',"
                + "'"+this.securityAnswer +"'"
                +")";
        
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
