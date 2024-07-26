
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karaarslan
 */
public class ChangePassword extends DbConnection implements IInfoController {

    private String id_number = null;
    private String phone_number = null;
    private String security_answer = null;
    private String oldPassword = null;
    private String newPassword = null;
    
    
    
    
    @Override
    public boolean isInfoValid() {
       return !(this.id_number == null
               || this.phone_number == null
               || this.security_answer == null
               || this.newPassword == null);
    }

    @Override
    public AccountInfo getAccountInfo() {
        return  AccountInfo.getInstance();
    }
    
    public boolean isPasswordChanged()
    {
        if(isInfoValid())
        {
            String query = "UPDATE Users "
                    + "SET password = '" +this.newPassword + "'"
                    + " WHERE "
                    + "id_number = '" + this.id_number+ "'"
                    + " AND "
                    + "phone_number = '" +this.phone_number + "'"
                    + " AND "
                    + "security_answer = '" +this.security_answer+ "'";
                    
            if(this.oldPassword != null)
            {
                query += " AND password = '"+ this.oldPassword+ "'";
            }
            
            try {
                super.statement = super.connection.createStatement();
                           return statement.executeUpdate(query) == 1;
            } catch (SQLException ex) {
                Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
           
        }
        else
        {
            return false;
        }
    }
    
    
    
    

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getSecurity_answer() {
        return security_answer;
    }

    public void setSecurity_answer(String security_answer) {
        this.security_answer = security_answer;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    
    
    
    
    
    
}
