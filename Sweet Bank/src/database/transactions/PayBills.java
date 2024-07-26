
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
public class PayBills extends DbConnection implements IInfoController{

    private String billName = null;
    private double billAmount = 0;
    
    @Override
    public boolean isInfoValid() {
        return !(this.billName == null
                || this.billAmount == 0
                || getAccountInfo().getBalance() < this.billAmount);
    }

    @Override
    public AccountInfo getAccountInfo() {
        return AccountInfo.getInstance();
    }
    
    private void reduceBalance()
    {
        String query = "UPDATE User_Balance "
                    + "SET balance = balance - '" +this.billAmount + "'"
                    +" WHERE user_ID = '" +getAccountInfo().getUser_ID() + "'";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            getAccountInfo().setBalance(getAccountInfo().getBalance()-this.billAmount);
        } catch (SQLException ex) {
            Logger.getLogger(PayBills.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    private void resetBill()
    {
        if(isInfoValid())
        {
            switch(this.billName)
            {
                case "electricity":
                    getAccountInfo().setElectricty_bill(0);
                    break;
                    
                case "water":
                    getAccountInfo().setWater_bill(0);
                    break;
                    
                case "gas":
                    getAccountInfo().setGas_bill(0);
                    break;
                    
                case "internet":
                    getAccountInfo().setInternet_bill(0);
                    break;
                    
            }
        }
    }
    
    public boolean isBillPaid()
    {
        if(isInfoValid())
        {
            String query = "UPDATE User_Bills "
                    + "SET " +this.billName + " = 0" 
                    +" WHERE user_ID = '" +getAccountInfo().getUser_ID() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                this.reduceBalance(); 
                this.resetBill();
            } catch (SQLException ex) {
                Logger.getLogger(PayBills.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
