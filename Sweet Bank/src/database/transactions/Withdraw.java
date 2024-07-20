
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
public class Withdraw extends DbConnection implements IInfoController{

    private int withdrawAmount = 0;

 
    public boolean isWithdrawComplete()
    {
        if(isInfoValid())
        {
            
            String query = "UPDATE User_Balance "
                    + "SET balance = balance - '" +this.withdrawAmount + "'"
                    +" WHERE user_ID = '" +getAccountInfo().getUser_ID() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInfo().setBalance(getAccountInfo().getBalance()- this.withdrawAmount);
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
        return !(this.withdrawAmount == 0
                || getAccountInfo().getBalance() < this.withdrawAmount);
    }

    @Override
    public AccountInfo getAccountInfo() {
        return AccountInfo.getInstance();
    }
       
    
    
    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
}
