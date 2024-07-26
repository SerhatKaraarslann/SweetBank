
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
public class Transfer extends DbConnection implements IInfoController{
    
    private int transferAmount = 0;
    private String remittenceReceiver = null; // Custom_Number

    @Override
    public boolean isInfoValid() {
       return !(this.transferAmount == 0
               || this.remittenceReceiver == null
               || this.transferAmount > getAccountInfo().getBalance()
               || this.remittenceReceiver.equals(getAccountInfo().getCustom_No()));
    }

    @Override
    public AccountInfo getAccountInfo() {
        return AccountInfo.getInstance();
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public String getRemittenceReceiver() {
        return remittenceReceiver;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setRemittenceReceiver(String remittenceReceiver) {
        this.remittenceReceiver = remittenceReceiver;
    }
    
    
    public boolean isTransferComplete()
    {
        if(isInfoValid())
        {
            String query = "UPDATE User_Balance "
                    + "SET balance = balance - '" +this.transferAmount + "'"
                    +" WHERE user_ID = '" +getAccountInfo().getUser_ID() + "'";
            String query2 = "UPDATE User_Balance "
                    + "SET balance = balance + '" +this.transferAmount + "'"
                    +" WHERE custom_number = '" + this.remittenceReceiver+ "'";
            
            try {
                super.statement = super.connection.createStatement();
                if(statement.executeUpdate(query2)== 1)
                {
                    statement.executeUpdate(query);
                    getAccountInfo().setBalance(getAccountInfo().getBalance()-transferAmount);
                    return true;
                }
                else
                {
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
          
        }
        else
        {
            return false;
        }
    }
    
    
    
}
