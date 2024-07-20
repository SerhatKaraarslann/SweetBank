
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
public class Deposit extends DbConnection implements IInfoController{

    private int depositAmount = 0;

    public boolean isDepositComplete()
    {
        if(isInfoValid())
        {
            String query = "UPDATE User_Balance "
                    + "SET balance = balance + '" +this.depositAmount + "'"
                    +" WHERE user_ID = '" +getAccountInfo().getUser_ID() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInfo().setBalance(getAccountInfo().getBalance()+ this.depositAmount);
            } catch (SQLException ex) {
                Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
           
        }
        else
        {
            return false;
        }
    }
 
    
    @Override
    public boolean isInfoValid() {
        return !(this.depositAmount == 0);
    }

    @Override
    public AccountInfo getAccountInfo() {
       return AccountInfo.getInstance();
    }
    
      
    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }
    
       
    
    
}
