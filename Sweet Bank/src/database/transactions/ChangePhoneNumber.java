
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import gui.settings.TextSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karaarslan
 */
public class ChangePhoneNumber extends DbConnection implements IInfoController{

    private String phoneNumber = null;
    
    
    
    @Override
    public boolean isInfoValid() {
        return !(this.phoneNumber == null
                || TextSettings.isLengthLessThan(12, phoneNumber));
    }

    @Override
    public AccountInfo getAccountInfo() {
        return AccountInfo.getInstance();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public boolean isPhoneNumberChanged()
    {
        if(isInfoValid())
        {
            String query = "UPDATE Users "
                    + "SET phone_number = '"+this.phoneNumber + "'"
                    + " WHERE user_ID = '"+getAccountInfo().getUser_ID() + "'";
            
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInfo().setPhone_Number(this.phoneNumber);
            } catch (SQLException ex) {
                Logger.getLogger(ChangePhoneNumber.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            return true;
        }
        else
        {
            return false;
        }
       
    }
    
}
